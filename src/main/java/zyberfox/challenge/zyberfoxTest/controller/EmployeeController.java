package zyberfox.challenge.zyberfoxTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zyberfox.challenge.zyberfoxTest.entity.Employee;
import zyberfox.challenge.zyberfoxTest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<Employee> getEmployees()
    {
        return service.getEmployees();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {

        return service.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping(path = "/create")
    public Employee createEmployee(@RequestBody Employee employee) {

        return service.saveEmployee(employee);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(path = "/update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping (value="/update-salary/{id}/{percentage}")
    public Employee updateSalary(@PathVariable ("id") int id, @PathVariable ("percentage") double percentage)
    {
        Employee employee = service.findById(id);
        employee.setSalary(service.calculateSalaryIncrease(percentage,employee.getSalary()));
        return  service.updateEmployee(employee);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping (value="/birthday-month/{birthdayMonth}")
    public List<Employee> findByBirthdayMonth(@PathVariable ("birthdayMonth") int birthdayMonth)
    {
        return  service.findByBirthDayMonth(birthdayMonth);
    }
}
