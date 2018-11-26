package com.librarysystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.librarysystem.entity.Manager;
import com.librarysystem.entity.Reader;
import com.librarysystem.util.DBUtil;

public class ManagerDao extends BaseDao {
	public int addManager(Manager m){
		int count=0;
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("insert into manager(name,wordcardnum,account,password) values(?,?,?,?)");
			preparedStatement.setString(1, m.getName());
			preparedStatement.setString(2, m.getWordcardnum());
			preparedStatement.setString(3,m.getAccount() );
			preparedStatement.setString(4,m.getPassword());
			count=preparedStatement.executeUpdate();
			
		}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
		    }finally{
		    	closed();
		    }
		return count;

			}	
	public boolean isExist(Manager m){
		boolean flag = false;
		try {
			int count = 0;
			connection = DBUtil.getConnection();
			String sql = "select count(*) as count from manager where  account=?";
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, m.getAccount());
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
	public int updatePassword(Manager m){
		 int i=0;
			try{
				connection = DBUtil.getConnection();
				preparedStatement=connection.prepareStatement("update reader set password=?,name=? where account=? ");
				
				preparedStatement.setString(1, m.getPassword());
				preparedStatement.setString(2, m.getName());
				preparedStatement.setString(3, m.getAccount());
				i=preparedStatement.executeUpdate();
			
				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					
			    }
			return i;
		} 
	public List<Manager> Manager(){
		List<Manager> list = new ArrayList<>();
		try{
			connection = DBUtil.getConnection();
			preparedStatement=connection.prepareStatement("select * from manager ");
			resultSet=preparedStatement.executeQuery();
			Manager m= null;
			while(resultSet.next()){
				m= new Manager();
				 m.setAccount(resultSet.getString("account"));
				 m.setMid(resultSet.getInt("mid"));
				 m.setName(resultSet.getString("name"));
				 m.setPassword(resultSet.getString("password"));
				 m.setWordcardnum(resultSet.getString("wordcardnum"));
				 list.add(m);
			}
			return list;
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				return null;
		    }
	}

	
	
	
}
