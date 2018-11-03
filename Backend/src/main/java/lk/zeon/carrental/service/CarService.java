package lk.zeon.carrental.service;

import lk.zeon.carrental.dto.VehicleDto;
import lk.zeon.carrental.entity.Cars;

import java.util.ArrayList;

/**
 * Created by Ze on 10/31/2018.
 */
public interface CarService {
    public boolean addVehicles(VehicleDto vehicleDto);
    public boolean deleteVehicle(VehicleDto vehicleDto);
    public ArrayList<VehicleDto> getAllvehicles();
    public VehicleDto getVehicleByModel(String model);
    public VehicleDto getVehicleBYBrand(String brand);
    public VehicleDto updateVehicleDetail(VehicleDto vehicleDto);
}
