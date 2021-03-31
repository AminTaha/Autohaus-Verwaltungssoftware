package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_ENGINE")
public class Engine {

    @Id
    private long engineId;

    @ManyToOne
    private CarModel carModel;

    private String engine;

}
