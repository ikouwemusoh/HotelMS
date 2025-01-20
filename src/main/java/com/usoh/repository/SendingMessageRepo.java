package com.usoh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usoh.models.SendingMessage;

@Repository
public interface SendingMessageRepo extends JpaRepository<SendingMessage, Integer>{

}
