package com.infotech.bookTicketApp.servicelayer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.bookTicketApp.daoLayer.daoInterface;
import com.infotech.bookTicketApp.entity.Ticket;

@Service
public class serviceLayer {
     @Autowired
	private daoInterface daoInterface;
	public Ticket createBooking(Ticket ticket) {
		// TODO Auto-generated method stub
		return daoInterface.save(ticket);
	}
	public Optional<Ticket> getTicketById(Integer ticketId) {
		return daoInterface.findById(ticketId);
	}
}
