package com.finalproject.yusuf.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalproject.yusuf.bus.model.*;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}