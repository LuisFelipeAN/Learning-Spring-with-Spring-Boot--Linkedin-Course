package com.example.demo.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
