package lk.zeon.carrental.service;

import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.entity.Admin;

import java.util.ArrayList;

/**
 * Created by Ze on 10/31/2018.
 */
public interface AdminService {
    public boolean addNewAdmin(AdminDto admin);
    public AdminDto getAdminDetail(int adminId);
    public AdminDto updateAdminDetail(AdminDto adminDto);
    public ArrayList<AdminDto> getAdmins();
    public long getTotalCustomers();


}
