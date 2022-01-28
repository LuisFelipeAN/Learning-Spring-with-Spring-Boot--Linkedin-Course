package com.example.demo.data.repository;

import java.sql.Date;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.entity.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>{
	public Iterable<Reservation> findReservationByReservationDate(Date date);

}
