package lk.zeon.carrental.dto;

/**
 * Created by Ze on 10/31/2018.
 */
public class VehicleDto {

    private int vehicleId;

    private String brand;
    private String type;
    private String model;
    private String plateNumber;
    private int seatQuantity;
    private String fuelType;
    private String conditions;
    private Double dailyPrice;


    public VehicleDto() {
    }

    public VehicleDto( String brand, String type, String model, String plateNumber, int seatQuantity, String fuelType, String conditions, Double dailyPrice) {

        this.brand = brand;
        this.type = type;
        this.model = model;
        this.plateNumber = plateNumber;
        this.seatQuantity = seatQuantity;
        this.fuelType = fuelType;
        this.conditions = conditions;
        this.dailyPrice = dailyPrice;
    }


    public VehicleDto(int vehicleId, String brand, String type, String model, String plateNumber, int seatQuantity, String fuelType, String conditions, Double dailyPrice) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.plateNumber = plateNumber;
        this.seatQuantity = seatQuantity;
        this.fuelType = fuelType;
        this.conditions = conditions;
        this.dailyPrice = dailyPrice;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
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

    @Override
    public String toString() {
        return "VehicleDto{" +
                "vehicleId=" + vehicleId +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", seatQuantity=" + seatQuantity +
                ", fuelType='" + fuelType + '\'' +
                ", conditions='" + conditions + '\'' +
                ", dailyPrice=" + dailyPrice +
                '}';
    }
}
