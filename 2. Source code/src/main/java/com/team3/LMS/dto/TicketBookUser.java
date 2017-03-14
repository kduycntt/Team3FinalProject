package com.team3.LMS.dto;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_book_user")
public class TicketBookUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TicketBookUserPK id;
	
	private Ticket ticket;
	
	private Book book;
	// bi-directional many-to-one association to Book
	@ManyToOne
	@JoinColumn(name = "isbn", insertable = false, updatable = false)
	public Book getBook(){
		return book;
	}
	// bi-directional many-to-one association to Ticket
	@ManyToOne
	@JoinColumn(name = "ticket_id", insertable = false, updatable = false)
	public Ticket getTicket(){
		return ticket;
	}

	// bi-directional many-to-one association to UserInfo
	@ManyToOne
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	private UserInfo userInfo;

	public TicketBookUser() {
	}

	public TicketBookUserPK getId() {
		return this.id;
	}

	public void setId(TicketBookUserPK id) {
		this.id = id;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}