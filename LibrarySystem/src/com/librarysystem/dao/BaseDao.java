package com.librarysystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NULL
 *
 */
public class BaseDao {
	protected Connection connection;

	protected Statement statement;

	protected ResultSet resultSet;

	protected PreparedStatement preparedStatement;

	protected void closed() {
		try {
			if (resultSet != null)
				resultSet.close();

			if (statement != null)
				statement.close();

			if (resultSet != null)
				resultSet.close();

			if (preparedStatement != null)
				preparedStatement.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
