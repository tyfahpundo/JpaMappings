package zw.co.afrosoft.jpamappings.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.jpamappings.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
