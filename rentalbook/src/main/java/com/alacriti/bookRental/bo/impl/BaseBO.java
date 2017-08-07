package com.alacriti.bookRental.bo.impl;

import java.sql.Connection;

import com.alacriti.bookRental.util.LogUtil;


public class BaseBO {
	private static Connection connection = null;

	public BaseBO() {
	}

	public BaseBO(Connection connection) {
		this.connection = connection;
	}

	public static Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
