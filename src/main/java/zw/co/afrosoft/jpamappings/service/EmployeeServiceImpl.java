package zw.co.afrosoft.jpamappings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.jpamappings.model.Employee;
import zw.co.afrosoft.jpamappings.persistence.EmployeeRepository;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository repo;

    @Override
    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    @Override
    public Employee singleEmployee(Long id) {
        Optional<Employee> employee = repo.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }else{
            throw new RuntimeException("Employee Not Found");
        }
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return repo.save(employee);
    }
}
