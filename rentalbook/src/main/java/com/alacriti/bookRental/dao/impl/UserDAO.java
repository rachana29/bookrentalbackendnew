package com.alacriti.bookRental.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.alacriti.bookRental.dao.IUserDAO;
import com.alacriti.bookRental.model.vo.Login;
public class UserDAO extends BaseDAO implements IUserDAO {

	public UserDAO() {

	}

	public UserDAO(Connection conn) {
		super(conn);
	}
	public List<Login> selectMessage() throws DAOException {
	DataSource dataSource = null;
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet result = null;
	List<Login> list = null;
	Login login = null;
	try {
		dataSource = (DataSource) new InitialContext()
				.lookup("java:jboss/datasources/TRAINEEE");
		connection = dataSource.getConnection();
		statement = connection
				.prepareStatement("select * from rachanas_bookRental_UserDetails");
		result = statement.executeQuery();
		list = new ArrayList<Login>();
		while (result.next()) {
			login = new Login();
			login.setUser_id(result.getInt(1));
			login.setUser_name(result.getString(2));
			login.setPassword(result.getString(3));
			login.setUser_type(result.getString(4));
			login.setEmail_id(result.getString(5));
			login.setMobile_number(result.getString(6));
			list.add(login);
			//System.out.println(login.getUser_name());
		}

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	return list;
	}
	
	public void createUserRole(Login userAddVO) throws DAOException{
		System.out.println("in userDAO,createUserRole() ");
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			String sqlCmd = "insert into rachanas_bookRental_UserDetails values(?,?,?,?,?,?);";
			
			stmt =getPreparedStatement(getConnection(), sqlCmd);
			stmt.setLong(1, userAddVO.getUser_id());
			stmt.setString(2, userAddVO.getUser_name());
			stmt.setString(3, userAddVO.getPassword());
			stmt.setString(4,userAddVO.getUser_type());
			stmt.setString(5,userAddVO.getEmail_id());
			stmt.setString(6,userAddVO.getMobile_number());
			int count= stmt.executeUpdate();
		
		} catch (SQLException e) {
				e.printStackTrace();
			throw new DAOException("SQLException in createUserRole():", e);
		} finally {
			close(stmt, rs);
		}
	}
	
	public Boolean checkLogin(Login userAddVO) throws DAOException{
		System.out.println("in userDAO,checkLogin() ");
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Boolean isValidUser = false;
		try {
			String sqlCmd = "SELECT * FROM rachanas_bookRental_UserDetails WHERE email_id = ? AND Password = ?";
			
			stmt =getPreparedStatement(getConnection(), sqlCmd);
			stmt.setString(1, userAddVO.getEmail_id());
			stmt.setString(2, userAddVO.getPassword());
			
			rs= stmt.executeQuery();
			
			if(rs.next())
			{
				isValidUser = true;
			}
		
		} catch (SQLException e) {
				e.printStackTrace();
			throw new DAOException("SQLException in createUserRole():", e);
		} finally {
			close(stmt, rs);
		}
		return isValidUser;
	}
	


}

/*	public void createUserRole(Login userAddVO) throws DAOException{
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
		String sqlCmd = "sql command";

		stmt =getPreparedStatementCreateUserRole(getConnection(), sqlCmd);
		stmt.setLong(1, userAddVO.getUser_id());
		stmt.setString(2, userAddVO.getUser_name());
		stmt.setString(3, userAddVO.getPassword());
		stmt.setString(4,userAddVO.getUser_type());
		stmt.setString(5,userAddVO.getEmail_id());
		stmt.setString(6,userAddVO.getMobile_number());
		stmt.executeUpdate();

		} catch (SQLException e) {
		e.printStackTrace();
		throw new DAOException("SQLException in createUserRole():", e);
		} finally {
		close(stmt, rs);
		}
		}

		

		public PreparedStatement getPreparedStatementCreateUserRole(Connection connection, String sqlCmd) throws SQLException{
		try {
		return connection.prepareStatement("insert into rachanas_bookRental_UserDetails values(?,?,?,?,?,?);");

		} catch (SQLException e) {
		throw e;
		}
		} */
		


	