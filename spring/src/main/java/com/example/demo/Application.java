package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.entity.Guest;
import com.example.demo.data.entity.Reservation;
import com.example.demo.data.entity.Room;
import com.example.demo.data.repository.GuestRepository;
import com.example.demo.data.repository.ReservationRepository;
import com.example.demo.data.repository.RoomRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		@Autowired
		RoomRepository roomRepository;
		
		@GetMapping
		public Iterable<Room> getRooms(){
			return this.roomRepository.findAll();
		}
	}
	
	@RestController
	@RequestMapping("/guests")
	public class GuestController{
		@Autowired
		GuestRepository guestRepository;
		
		@GetMapping
		public Iterable<Guest> getGuests(){
			return this.guestRepository.findAll();
		}
	}
	
	@RestController
	@RequestMapping("/reservations")
	public class ReservationController{
		@Autowired
		ReservationRepository reservationRepository;
		
		@GetMapping
		public Iterable<Reservation> getReservations(){
			return this.reservationRepository.findAll();
		}
	}

}
