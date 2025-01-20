package com.usoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usoh.models.Room;

@Repository
public interface RoomRepo extends JpaRepository<Room, Integer>{

}
