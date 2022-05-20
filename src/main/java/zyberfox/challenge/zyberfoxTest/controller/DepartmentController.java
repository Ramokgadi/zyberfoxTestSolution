package zyberfox.challenge.zyberfoxTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import zyberfox.challenge.zyberfoxTest.entity.Department;
import zyberfox.challenge.zyberfoxTest.entity.Employee;
import zyberfox.challenge.zyberfoxTest.repository.DepartmentRepository;
import zyberfox.challenge.zyberfoxTest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Department> getDepartments()
    {
        return repository.findAll();
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(path = "/create")
    public Department createDepartment(@RequestBody @NonNull Department department) {
        return repository.save(department);
    }

}
