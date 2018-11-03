package lk.zeon.carrental.dto;

import java.util.Date;

/**
 * Created by Ze on 10/31/2018.
 */
public class ReservationDto {

    private int reserveId;
    private String plateNumber;
    private Date pickupDate;
    private Date returnDate;
    private String reservationDate;
    private String customerId;


    public ReservationDto() {
    }

    public ReservationDto(String plateNumber, Date pickupDate, Date returnDate, String reservationDate, String customerId) {
        this.plateNumber = plateNumber;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.reservationDate = reservationDate;
        this.customerId = customerId;
    }

    public ReservationDto(int reserveId, String plateNumber, Date pickupDate, Date returnDate, String reservationDate, String customerId) {
        this.reserveId = reserveId;
        this.plateNumber = plateNumber;
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.reservationDate = reservationDate;
        this.customerId = customerId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "ReservationDto{" +
                "reserveId=" + reserveId +
                ", plateNumber='" + plateNumber + '\'' +
                ", pickupDate=" + pickupDate +
                ", returnDate=" + returnDate +
                ", reservationDate='" + reservationDate + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
