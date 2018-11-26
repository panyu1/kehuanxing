package com.librarysystem.dao;

import com.librarysystem.entity.BorrowBook;
import com.librarysystem.util.DBUtil;

public class BorrowBookDao extends BaseDao{
	public int addBorrowBook(BorrowBook bbook){
		int count=0;
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("insert into borrowbook(bid,librarycardnum,borrowtime,borrowdaynum) values(?,?,?,?)");
			preparedStatement.setInt(1,bbook.getBid());
			preparedStatement.setInt(2,bbook.getLibrarycardnum());
			preparedStatement.setString(3,bbook.getBorrowtime() );
			preparedStatement.setInt(4,bbook.getBorrowdaynum());
			count=preparedStatement.executeUpdate();
			
		}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
		    }finally{
		    	closed();
		    }
		return count;

			}	
}
