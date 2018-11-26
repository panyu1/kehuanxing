package com.librarysystem.service;

import java.util.List;

import com.librarysystem.dao.ReaderDao;
import com.librarysystem.entity.Reader;

public class ReaderService {
	private ReaderDao readerdao = new ReaderDao();
	Reader r=new Reader();
	public List<Reader> findReader(){
		return readerdao.findReader();		
	}
	public boolean isExist(Reader r){
		return readerdao.isExist(r);
		
	}
	public List<Reader> findAllReader(String name){
		return readerdao.findAllReader(name);		
	}
}
