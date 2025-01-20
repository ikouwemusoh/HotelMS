package com.usoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usoh.models.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
