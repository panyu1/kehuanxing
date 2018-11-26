package com.librarysystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.librarysystem.entity.Books;

import com.librarysystem.util.DBUtil;

public class BookDao extends BaseDao {
	public List<Books> findBook(String bookname){
		List<Books> list = new ArrayList<>();
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("select * from books where bookname=? ");
			preparedStatement.setString(1, bookname);
//			preparedStatement.setString(2, author);
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()){
				 Books b=new Books();
			     b.setBid(resultSet.getInt("bid"));
			     b.setBookname(resultSet.getString("bookname"));
			     b.setAuthor(resultSet.getString("author"));
			     b.setStock(resultSet.getInt("stock"));
				list.add(b);
			}
			return list;
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
		    }
	}
	public int updateStock(int bid){
		int i=0;
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("update books set stock=stock-1 where bid=?");
			preparedStatement.setInt(1, bid);
//			preparedStatement.setString(2, author);
			i=preparedStatement.executeUpdate();
			
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
		    }
		return i;
	}
	public int addStock(Books b){
		  int i=0;
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("update books set stock=stock+1 where bookname=? and author=?");
			preparedStatement.setString(1,b.getBookname());
			preparedStatement.setString(2, b.getAuthor());
			i=preparedStatement.executeUpdate();
		
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
		    }
		return i;
	} 
	
}
