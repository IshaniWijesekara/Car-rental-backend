package lk.zeon.carrental.service;

import lk.zeon.carrental.dto.rentDto;

/**
 * Created by Ze on 10/31/2018.
 */
public interface RentService {
    public boolean addRent(rentDto rentdto);
    public rentDto updateRentDetal(rentDto dto);
    public rentDto searchvehicle(String rentDate ,String returnDate, String plateNumber);
    public rentDto updateAdminConfirm(int adminId);
}
