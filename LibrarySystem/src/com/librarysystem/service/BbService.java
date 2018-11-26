package com.librarysystem.service;

import com.librarysystem.dao.BorrowBookDao;
import com.librarysystem.entity.BorrowBook;;

public class BbService {
	BorrowBookDao bbd=new BorrowBookDao();
	public int addBorrowBook(BorrowBook bbook){
		int count=bbd.addBorrowBook(bbook);
		return count;
	}
}
