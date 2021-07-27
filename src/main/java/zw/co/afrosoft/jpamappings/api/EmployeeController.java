package zw.co.afrosoft.jpamappings.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.afrosoft.jpamappings.model.Department;
import zw.co.afrosoft.jpamappings.model.Employee;
import zw.co.afrosoft.jpamappings.persistence.DepartmentRepository;
import zw.co.afrosoft.jpamappings.persistence.EmployeeRepository;
import zw.co.afrosoft.jpamappings.request.EmployeeRequest;
import zw.co.afrosoft.jpamappings.service.EmployeeServiceImpl;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;
    @Autowired
    private DepartmentRepository dRepo;
    @Autowired
    private EmployeeRepository eRepo;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees(){
        return new ResponseEntity<List<Employee>>(service.getEmployees(), HttpStatus.OK);
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getSingleEmployee(@PathVariable Long id){
        return new ResponseEntity<Employee>(service.singleEmployee(id),HttpStatus.OK);
    }
    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeRequest eRequest){
        Department dept = new Department();
        dept.setName(eRequest.getDepartment());

        dept = dRepo.save(dept);
        Employee employee = new Employee(eRequest);
        employee.setDepartment(dept);

        employee = eRepo.save(employee);
        return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
    }
    @DeleteMapping("/employees")
    public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam Long id){
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
        return new ResponseEntity<Employee>(service.updateEmployee(employee), HttpStatus.OK);
    }
}
