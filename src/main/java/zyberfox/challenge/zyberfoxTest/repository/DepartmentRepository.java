package zyberfox.challenge.zyberfoxTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zyberfox.challenge.zyberfoxTest.entity.Department;
import zyberfox.challenge.zyberfoxTest.entity.Employee;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

    Department findById(int id);
}
