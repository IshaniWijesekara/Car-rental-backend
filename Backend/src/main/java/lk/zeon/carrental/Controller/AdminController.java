package lk.zeon.carrental.Controller;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Ze on 11/1/2018.
 */

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/admin")
public class AdminController {

    @Autowired
    private  AdminService adminService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveAdmin(@RequestBody AdminDto adminDto){
        System.out.println("AdminDto"+adminDto);
        return adminService.addNewAdmin(adminDto);

    }

    @GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<AdminDto>getAdmin(){
        System.out.println("getAll");
        return adminService.getAdmins();
    }

    @GetMapping(value = "/{adminId}",produces = MediaType.APPLICATION_JSON_VALUE)
    public AdminDto getAdminByName(@PathVariable("adminId") Integer adminId ){
        return adminService.getAdminDetail(adminId);
    }
}
