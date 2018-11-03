package lk.zeon.carrental.repository;


import lk.zeon.carrental.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;


/**
 * Created by Ze on 10/31/2018.
 */
public interface AdminRepository extends JpaRepository<Admin, Integer>  {



    @Query(value = "SELECT * FROM admin",nativeQuery = true)
    ArrayList<Admin> getAllAdmin();

    }

