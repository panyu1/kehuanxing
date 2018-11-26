package com.librarysystem.service;

import java.util.List;

import com.librarysystem.dao.BookDao;
import com.librarysystem.entity.Books;

public class BookService {
         BookDao bd=new BookDao();
         public List<Books> findBook(String bookname){
     		return bd.findBook(bookname);		
     	}
        public int updateStock(int bid){
        	
        	return bd.updateStock(bid);
        }
        public int addStock(Books b){
        	return bd.addStock(b);
        }
}
