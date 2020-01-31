package com.infotech.bookTicketApp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infotech.bookTicketApp.entity.Ticket;
import com.infotech.bookTicketApp.servicelayer.serviceLayer;

@SpringBootApplication
public class TicketBookingAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TicketBookingAppApplication.class, args);
	    Ticket ticket = new Ticket();
	    ticket.setBookingDate(new Date());
	    ticket.setDestinationStation("Gokarna");
	    ticket.setEmail("nisahntgongale400@gmail.com");
        ticket.setPassengerName("Nishant Gongale");
        ticket.setSourceStation("Bangalore");
        ticket.setTicketId(134567);
        serviceLayer service = context.getBean(serviceLayer.class);
        service.createBooking(ticket);
	}

}
