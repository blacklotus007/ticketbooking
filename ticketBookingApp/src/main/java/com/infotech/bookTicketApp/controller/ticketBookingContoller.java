package com.infotech.bookTicketApp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.bookTicketApp.entity.Ticket;
import com.infotech.bookTicketApp.servicelayer.serviceLayer;

@RestController
@RequestMapping(value="/ticketbooking")
public class ticketBookingContoller {
	@Autowired
	public serviceLayer serviceLayer;
	 
	@PostMapping(value="/createbooking")
	public Ticket createBooking(Ticket ticket)
	{
		   return serviceLayer.createBooking(ticket);
	}

	@GetMapping(value="/ticket/{ticketId}")
	//@RequestMapping(value="/ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId")Integer ticketId){
		return serviceLayer.getTicketById(ticketId);
	}
}
