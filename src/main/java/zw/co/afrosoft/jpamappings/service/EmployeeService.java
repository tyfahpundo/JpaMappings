package zw.co.afrosoft.jpamappings.service;

import zw.co.afrosoft.jpamappings.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee singleEmployee(Long id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee updateEmployee(Employee employee);
}
