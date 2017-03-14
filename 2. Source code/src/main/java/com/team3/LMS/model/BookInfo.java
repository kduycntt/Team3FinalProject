package com.team3.LMS.model;

import com.team3.LMS.dto.Book;

public class BookInfo {
	private int isbn;
	private int amount;
	private int total_number_ticket;
	private byte valid;
	
	public BookInfo(){	
	}
	public BookInfo(Book book)
	{
		this.isbn = book.getIsbn();
		this.amount = book.getAmount();
		this.total_number_ticket = book.getBrwTcktNber();
		this.valid = book.getValidStatus();
	}
}
