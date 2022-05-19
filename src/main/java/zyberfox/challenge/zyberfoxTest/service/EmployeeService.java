package zyberfox.challenge.zyberfoxTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zyberfox.challenge.zyberfoxTest.entity.Employee;
import zyberfox.challenge.zyberfoxTest.repository.EmployeeRepository;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

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

    public List<Employee> employeesWhoBirthdayIn20Days()
    {
        List<Employee> employees = employeeRepository.findAll();
        List<Employee> employeeList = null;
        Date date = new Date();


        for (Employee emp : employees)
        {

            if(emp.getBirth_date().getMonth() == date.getMonth() && emp.getBirth_date().getDate() >= date.getDate()
                    && emp.getBirth_date().getDate() <= date.getDate() + 20)
            {
                employeeList.add(emp);
            }
        }
        return  employeeList;


    }

  // add 20 days before birthday
    //add imAGE
    // ADD DEPAERTMENTS OBJECTS
    // PULL BY SPECIFIC DEPARTMENT
    // THROW A BUG THAT THEY NEED TO FIX, BREAK THE SYSTEM

}
