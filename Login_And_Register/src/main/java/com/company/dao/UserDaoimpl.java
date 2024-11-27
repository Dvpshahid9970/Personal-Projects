package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;
import com.company.util.Query;

public class UserDaoimpl implements UserDao {

	public boolean isValidUser(String username, String password) {
		// TODO Auto-generated method stub
		String query = Query.read;
		try (Connection connection = DBUtil.getcon();
				PreparedStatement preparedstatement = connection.prepareStatement(query)) {

			preparedstatement.setString(1, username);
			preparedstatement.setString(2, password);

			ResultSet resultset = preparedstatement.executeQuery();
			return resultset.next();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		String query = Query.insert;
		try (Connection connection = DBUtil.getcon();
				PreparedStatement preparedstatement = connection.prepareStatement(query)) {

			preparedstatement.setString(1, user.getUsername());
			preparedstatement.setString(2, user.getEmail());
			preparedstatement.setString(3, user.getPassword());

			int rows = preparedstatement.executeUpdate();
			return rows > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
