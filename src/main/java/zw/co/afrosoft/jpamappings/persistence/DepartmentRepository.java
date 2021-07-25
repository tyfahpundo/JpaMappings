package zw.co.afrosoft.jpamappings.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.jpamappings.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
