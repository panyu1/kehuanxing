package com.librarysystem.service;

import java.util.List;

import com.librarysystem.dao.ManagerDao;
import com.librarysystem.entity.Manager;
import com.librarysystem.entity.Reader;

public class ManagerService {
	ManagerDao ma=new ManagerDao();
	public int addManager(Manager m){
		int count=ma.addManager(m);
		 return count;
		}
	public boolean isExist(Manager m) {
		// TODO Auto-generated method stub
		return ma.isExist(m);
	}
	public List<Manager> findManager(){
		return ma.Manager();		
	}
}
