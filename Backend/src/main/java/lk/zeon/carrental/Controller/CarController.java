package lk.zeon.carrental.Controller;

import lk.zeon.carrental.dto.VehicleDto;
import lk.zeon.carrental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
    public  boolean saveCar(@RequestBody VehicleDto vehicleDto){
        return carService.addVehicles(vehicleDto);
    }
}
