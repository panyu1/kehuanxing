package com.librarysystem.entity;

public class Books {
         private int bid;
         private String bookname;
         private String author;
         private int stock;
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public Books(int bid, String bookname, String author, int stock) {
			super();
			this.bid = bid;
			this.bookname = bookname;
			this.author = author;
			this.stock = stock;
		}
		public Books() {
			super();
			// TODO Auto-generated constructor stub
		}
         
         
         
}
