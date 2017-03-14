package com.team3.LMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team3.LMS.dao.TicketBookUserDao;
import com.team3.LMS.dao.TicketDao;
import com.team3.LMS.dto.Ticket;

@Service
@Transactional
public class TicketService {
	@Autowired
	private TicketDao ticketDao;
	@Autowired
	private TicketBookUserDao tbuDao;
	
	public Ticket findByticketId(int ticketId)
	{
		return ticketDao.findByticketId(ticketId);
	}

	public List<Ticket> getTicketList() {
		return (List<Ticket>) ticketDao.findAll();
	}

	public Page<Ticket> findAll(Pageable pageable) {
		return ticketDao.findAll(pageable);
	}

	public void addTicket(Ticket ticket) {
		ticketDao.save(ticket);
	}

	public void removeTicket(int id) {
		ticketDao.delete(id);
	}

	public Ticket getTicket(int id) {
		return ticketDao.findOne(id);
	}
}
