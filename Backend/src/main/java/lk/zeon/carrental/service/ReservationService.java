package lk.zeon.carrental.service;

import lk.zeon.carrental.dto.ReservationDto;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ze on 10/31/2018.
 */
public interface ReservationService {
    public boolean addReservation(ReservationDto  reservationDto);
    public ArrayList<ReservationDto> getAllReserevVehicle();
    public ReservationDto getSelectedVehicle(String plateNumber);
    public  ReservationDto getSelectedVehicleByPickupDate(Date pickupDate);
}
