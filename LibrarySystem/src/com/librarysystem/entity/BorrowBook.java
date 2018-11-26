package com.librarysystem.entity;

public class BorrowBook {
       private int id;
       private int bid;
       private int librarycardnum;
       private String borrowtime;
       private int borrowdaynum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getLibrarycardnum() {
		return librarycardnum;
	}
	public void setLibrarycardnum(int librarycardnum) {
		this.librarycardnum = librarycardnum;
	}
	public String getBorrowtime() {
		return borrowtime;
	}
	public void setBorrowtime(String borrowtime) {
		this.borrowtime = borrowtime;
	}
	public int getBorrowdaynum() {
		return borrowdaynum;
	}
	public void setBorrowdaynum(int borrowdaynum) {
		this.borrowdaynum = borrowdaynum;
	}
	public BorrowBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BorrowBook(int id, int bid, int librarycardnum, String borrowtime, int borrowdaynum) {
		super();
		this.id = id;
		this.bid = bid;
		this.librarycardnum = librarycardnum;
		this.borrowtime = borrowtime;
		this.borrowdaynum = borrowdaynum;
	}
       
       
       
}
