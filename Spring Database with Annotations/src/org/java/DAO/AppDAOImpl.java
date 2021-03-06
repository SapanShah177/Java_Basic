package org.java.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.java.model.user;


public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;

	public AppDAOImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	@Override
	public List<user> listUsers() {

		String sql = "select * from users";
		List<user> listUsers = new ArrayList<user>();
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			java.sql.PreparedStatement ps =  conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user users = new user(rs.getInt("user_id"), rs.getString("name"), rs.getString("email"));
				listUsers.add(users);
			}
			rs.close();
			ps.close();
			return listUsers;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}
}
