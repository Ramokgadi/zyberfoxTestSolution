package zyberfox.challenge.zyberfoxTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zyberfox.challenge.zyberfoxTest.entity.Employee;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {

}
