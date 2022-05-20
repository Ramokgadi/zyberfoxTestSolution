package zyberfox.challenge.zyberfoxTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zyberfox.challenge.zyberfoxTest.entity.Department;
import zyberfox.challenge.zyberfoxTest.entity.Employee;
import zyberfox.challenge.zyberfoxTest.repository.DepartmentRepository;
import zyberfox.challenge.zyberfoxTest.repository.EmployeeRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Employee> getEmployees()
    {
        return  employeeRepository.findAll();
    }

    public Employee findById( int id)
    {
        return employeeRepository.getById(id);
    }

    public Employee updateEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public double calculateSalaryIncrease(double increasePercentage,double salary)
    {
        return  salary + (salary * (increasePercentage/100));
    }

    public List<Employee> findByStartDate(Date date)
    {
        List<Employee> employees = employeeRepository.findAll();

        List<Employee> employeeList = null;
        for (Employee emp : employees)
        {
            if(emp.getHire_date().before(date) )
            {
                employeeList.add(emp);
            }
        }
        return  employeeList;
    }


    public List<Employee> findByBirthDayMonth(int birthdayMonth)
    {
        //Method is not returning results as expected, Please fix
        List<Employee> employees = employeeRepository.findAll();
        List<Employee> employeeList = null;
        for (Employee emp : employees)
        {
            if(emp.getBirth_date().getMonth()   == birthdayMonth )
            {
                employeeList.add(emp);
            }
        }
        return  employeeList;
    }

    public List<Employee> getEmployeesByDepartmentId(int id)
    {
        List<Employee> employees = employeeRepository.findAll();
        Department department = departmentRepository.findById(id);
        List<Employee> employeeList = new ArrayList<>();
        if(department != null)
        {
            for (Employee emp: employees)
            {
                if(department.getId() == id)
                {
                    employeeList.addAll(department.getEmployees());
                    break;
                }
            }
            return employeeList;
        }
        else {
            return null;
        }

    }





}
