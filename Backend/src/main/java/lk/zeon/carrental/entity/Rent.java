package lk.zeon.carrental.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ze on 10/30/2018.
 */
@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rentId;

    private String plateNumber;
    private Date rentDate;
    private Date returnDate;
    private int rentHour;
    private int rentFee;
    private String fuelProvidedBy;
    private Double fuelCharj;
    private Double downPayment;
    private  Double totalPaid;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Admin admin;

    public Rent() {
    }

    public Rent(String plateNumber, Date rentDate, Date returnDate, int rentHour, int rentFee, String fuelProvidedBy, Double fuelCharj, Double downPayment, Double totalPaid, Customer customer, Admin admin) {
        this.plateNumber = plateNumber;
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentHour = rentHour;
        this.rentFee = rentFee;
        this.fuelProvidedBy = fuelProvidedBy;
        this.fuelCharj = fuelCharj;
        this.downPayment = downPayment;
        this.totalPaid = totalPaid;
        this.customer = customer;
        this.admin = admin;
    }

    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getRentHour() {
        return rentHour;
    }

    public void setRentHour(int rentHour) {
        this.rentHour = rentHour;
    }

    public int getRentFee() {
        return rentFee;
    }

    public void setRentFee(int rentFee) {
        this.rentFee = rentFee;
    }

    public String getFuelProvidedBy() {
        return fuelProvidedBy;
    }

    public void setFuelProvidedBy(String fuelProvidedBy) {
        this.fuelProvidedBy = fuelProvidedBy;
    }

    public Double getFuelCharj() {
        return fuelCharj;
    }

    public void setFuelCharj(Double fuelCharj) {
        this.fuelCharj = fuelCharj;
    }

    public Double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(Double downPayment) {
        this.downPayment = downPayment;
    }

    public Double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentId=" + rentId +
                ", plateNumber='" + plateNumber + '\'' +
                ", rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", rentHour=" + rentHour +
                ", rentFee=" + rentFee +
                ", fuelProvidedBy='" + fuelProvidedBy + '\'' +
                ", fuelCharj=" + fuelCharj +
                ", downPayment=" + downPayment +
                ", totalPaid=" + totalPaid +
                ", customer=" + customer +
                ", admin=" + admin +
                '}';
    }
}
