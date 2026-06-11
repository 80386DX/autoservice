package net.etwas.autoservice.model;

import jakarta.persistence.*;
import lombok.*;
import net.etwas.autoservice.common.BodyType;
import net.etwas.autoservice.common.Fuel;

@Entity
@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Fuel fuel;
    private BodyType bodyType;
    private String licensePlate;
    private Integer km;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
