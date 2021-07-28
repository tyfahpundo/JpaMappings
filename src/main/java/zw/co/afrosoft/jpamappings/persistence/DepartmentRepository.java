package zw.co.afrosoft.jpamappings.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.afrosoft.jpamappings.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
