package com.usoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usoh.models.RoomAllocation;

@Repository
public interface RoomAllocationRepo extends JpaRepository<RoomAllocation, Integer>{

}
