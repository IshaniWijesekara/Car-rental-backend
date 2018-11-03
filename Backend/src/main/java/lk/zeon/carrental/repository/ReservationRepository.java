package lk.zeon.carrental.repository;


import lk.zeon.carrental.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ze on 10/31/2018.
 */
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
