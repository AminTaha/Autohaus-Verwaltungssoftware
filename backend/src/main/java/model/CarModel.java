package model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_CARMODEL")
public class CarModel extends PanacheEntityBase implements Serializable {

    @Id
    private long modelId;

    @ManyToOne
    private Manufacturer manufacturer;

    private String model;

    public CarModel(){}
}
