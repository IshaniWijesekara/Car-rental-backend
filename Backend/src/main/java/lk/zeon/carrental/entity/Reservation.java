package lk.zeon.carrental.entity;

import javax.persistence.*;
import java.util.Date;


/**
 * Created by Ze on 10/30/2018.
 */
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reserveId;
    private String plateNumber;
    private Date pickupDate;
    private Date returnDate;
    private String reservationDate;

    @ManyToOne
    private Customer customer;

    public Reservation() {
    }

    public Reservation(String plateNumber, Date pickupDate, Date returnDate, String reservationDate, Customer customer) {
        this.plateNumber = plateNumber;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.reservationDate = reservationDate;
        this.customer = customer;
    }

    public int getReserveId() {
        return reserveId;
    }

    public void setReserveId(int reserveId) {
        this.reserveId = reserveId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reserveId=" + reserveId +
                ", plateNumber='" + plateNumber + '\'' +
                ", pickupDate=" + pickupDate +
                ", returnDate=" + returnDate +
                ", reservationDate='" + reservationDate + '\'' +
                ", customer=" + customer +
                '}';
    }
}
