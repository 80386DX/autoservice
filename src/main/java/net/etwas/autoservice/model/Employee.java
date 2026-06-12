package net.etwas.autoservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "employees")
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee extends Human{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, name = "e_mail", nullable = false)
    private String email;

    private Double salary;

    @OneToMany
    @JoinColumn(name = "work_id")
    private List<Work> work;

}
