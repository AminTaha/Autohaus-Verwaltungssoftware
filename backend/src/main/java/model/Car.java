package model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "T_CAR")
public class Car extends PanacheEntityBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId;

    private String brand;
    private String tradeName;
    private String type;

    //vehicle identification number, Fahrgestellnummer
    private String vinNumber;

    //first registration (approval) of the car
    private Integer approvalDay;
    private Integer approvalMonth;
    private Integer approvalYear;

    private String vehicleType;
    private String color;
    private String colorCode;
    private String motorType;
    private String driveType;
    private String performance;
    private String cubicCapacity;
    private String mileage;

    @OneToOne
    Manufacturer manufacturer;

    @OneToOne
    CarModel carModel;

    @OneToOne
    Engine engine;

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public Integer getApprovalDay() {
        return approvalDay;
    }

    public void setApprovalDay(Integer approvalDay) {
        this.approvalDay = approvalDay;
    }

    public Integer getApprovalMonth() {
        return approvalMonth;
    }

    public void setApprovalMonth(Integer approvalMonth) {
        this.approvalMonth = approvalMonth;
    }

    public Integer getApprovalYear() {
        return approvalYear;
    }

    public void setApprovalYear(Integer approvalYear) {
        this.approvalYear = approvalYear;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(String cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
