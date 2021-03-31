package model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "T_MANUFACTURER")
public class Manufacturer extends PanacheEntityBase implements Serializable {

    @Id
    private long manufacturerId;

    private String name;

    public Manufacturer() {}

}
