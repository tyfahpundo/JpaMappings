package zw.co.afrosoft.jpamappings.model;

import lombok.*;
import zw.co.afrosoft.jpamappings.request.EmployeeRequest;

import javax.persistence.*;


@AllArgsConstructor
@Data
@ToString
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    //Reference variable for the department

    @JoinColumn(name = "department_id")
    @OneToOne
    private Department department;

    public Employee(EmployeeRequest req){
        this.name = req.getName();
    }

    public Employee() {

    }
}
