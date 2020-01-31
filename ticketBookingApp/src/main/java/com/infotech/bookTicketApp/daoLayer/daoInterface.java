package com.infotech.bookTicketApp.daoLayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.bookTicketApp.entity.Ticket;

@Repository
public interface daoInterface extends CrudRepository<Ticket,Integer> {
	 
	

}
