package lk.zeon.carrental.repository;

import lk.zeon.carrental.entity.Customer;
import lk.zeon.carrental.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ze on 10/31/2018.
 */
public interface RenttRepositroy extends JpaRepository<Rent,Integer> {
}
