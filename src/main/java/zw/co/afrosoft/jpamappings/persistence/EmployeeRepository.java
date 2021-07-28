package zw.co.afrosoft.jpamappings.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.afrosoft.jpamappings.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
