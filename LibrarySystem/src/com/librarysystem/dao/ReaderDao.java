package com.librarysystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.librarysystem.dao.BaseDao;
import com.librarysystem.entity.Reader;
import com.librarysystem.util.DBUtil;

public class ReaderDao extends BaseDao{
	public List<Reader> findReader(){
		List<Reader> list = new ArrayList<>();
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("select * from Reader ");
			resultSet=preparedStatement.executeQuery();
			Reader r= null;
			while(resultSet.next()){
				 r= new Reader();
				 r.setRid(resultSet.getInt("rid"));
				 r.setName(resultSet.getString("name"));
				 r.setLibrarycardnum(resultSet.getString("librarycardnum"));
				 r.setAccount(resultSet.getString("account"));
				 r.setPassword(resultSet.getString("password"));
				 list.add(r);
			}
			return list;
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
		    }
	}
	
	public boolean isExist(Reader r){
		boolean flag = false;
		try {
			int count = 0;
			connection = DBUtil.getConnection();
			String sql = "select count(*) as count from reader where  account=?";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, r.getAccount());
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
				count = resultSet.getInt("count");
			}
			if (count != 0) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closed();
		}
		return flag;
	}
	
//	public int updateXX(){
//		int count=0;
//		
//		try {
//			connection =DBUtil.getConnection();
//			String sql="update from reader set password=? where name=?";
//			preparedStatement = connection.prepareStatement(sql);
//			preparedStatement.setString(1, r.getName());
//			resultSet = preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return count;
//	}
	public List<Reader> findAllReader(String name){
		List<Reader> list = new ArrayList<>();
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("select * from reader where name=?");
			preparedStatement.setString(1, name);
			resultSet=preparedStatement.executeQuery();
			Reader r= null;
			while(resultSet.next()){
				 r= new Reader();
				 r.setRid(resultSet.getInt("rid"));
				 r.setName(resultSet.getString("name"));
				 r.setLibrarycardnum(resultSet.getString("librarycardnum"));
				 r.setAccount(resultSet.getString("account"));
				 r.setPassword(resultSet.getString("password"));
				 list.add(r);
			}
			return list;
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
		    }
	}
	
	
}
