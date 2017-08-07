package com.alacriti.bookRental.Delegate;
import java.sql.Connection;
import java.util.List;

import com.alacriti.bookRental.bo.IUserBO;
import com.alacriti.bookRental.bo.impl.userBO;
import com.alacriti.bookRental.model.vo.Login;
public class UserDelegate extends BaseDelegate{


	public List<Login> getMessage(Long userId) {
		boolean rollBack = false;
		Connection connection = null;
		List<Login> msg = null;
		try {
			connection = startDBTransaction();
			setConnection(connection);
			IUserBO sampleBO = new userBO();
			msg = sampleBO.retrieveMessage();
		} catch (Exception e) {
			e.printStackTrace();
			rollBack = true;
		} finally {
			endDBTransaction(connection, rollBack);
		}

		return msg;
	}
	/*public void getUserDetails(Login userAddVO){
		boolean rollBack = false;
		Connection connection = null;
		try {
			connection = startDBTransaction();
			setConnection(connection);
			userBO userRoleBO= new userBO(getConnection());
			userBO.retrieveMessage(userAddVO);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			endDBTransaction(connection, rollBack);
		}
	}
	*/
	
	public Boolean createUserRole(Login userAddVO) {
		System.out.println("in UserDelegate, createUserRole");
		boolean rollBack = false;
		Connection connection = null;
		Boolean isValidUser = null;
		try {
			connection = startDBTransaction();
			setConnection(connection);
			userBO userBO = new userBO(getConnection());
			isValidUser = userBO.createUserRole(userAddVO);
		} catch (Exception e) {
			rollBack = true;
		} finally {
			endDBTransaction(connection, rollBack);
		}
		return isValidUser;
	}

public void createUser(Login userAddVO){
		boolean rollBack = false;
		Connection connection = null;
		try {
		connection = startDBTransaction();
		setConnection(connection);
		userBO userBO= new userBO(getConnection());
		userBO.createUser(userAddVO);
		} catch (Exception e) {
		rollBack = true;
		} finally {
		endDBTransaction(connection, rollBack);
		}
		}
		}
	


