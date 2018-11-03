package lk.zeon.carrental.entity;

import javax.persistence.*;

/**
 * Created by Ze on 10/31/2018.
 */
@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehiId;

    private String brand;
    private String type;
    private String mode1;
    private String plateNumber;
    private String fuelType;
    private String conditions;
    private Double dailyPrice;
    private int seatQuantity;

    public Cars() {
    }

    public Cars(String brand, String type, String mode1, String plateNumber, String fuelType, String conditions, Double dailyPrice, int seatQuantity) {
        this.brand = brand;
        this.type = type;
        this.mode1 = mode1;
        this.plateNumber = plateNumber;
        this.fuelType = fuelType;
        this.conditions = conditions;
        this.dailyPrice = dailyPrice;
        this.seatQuantity = seatQuantity;
    }

    public int getVehiId() {
        return vehiId;
    }

    public void setVehiId(int vehiId) {
        this.vehiId = vehiId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMode1() {
        return mode1;
    }

    public void setMode1(String mode1) {
        this.mode1 = mode1;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public Double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(Double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "vehiId=" + vehiId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", mode1='" + mode1 + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", conditions='" + conditions + '\'' +
                ", dailyPrice=" + dailyPrice +
                ", seatQuantity=" + seatQuantity +
                '}';
    }
}
