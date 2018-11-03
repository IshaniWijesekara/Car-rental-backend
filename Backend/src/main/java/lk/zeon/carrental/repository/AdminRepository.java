package lk.zeon.carrental.repository;


import lk.zeon.carrental.dto.AdminDto;
import lk.zeon.carrental.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




/**
 * Created by Ze on 10/31/2018.
 */
public interface AdminRepository extends JpaRepository<Admin, Integer>  {

        @Query("SELECT count(c.id) FROM Admin c")
        long getTotalCustomers();

    }

