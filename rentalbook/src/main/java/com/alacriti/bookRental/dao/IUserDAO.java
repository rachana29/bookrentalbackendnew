package com.alacriti.bookRental.dao;

import java.util.List;

import javax.ws.rs.core.Response;

import com.alacriti.bookRental.dao.impl.DAOException;
import com.alacriti.bookRental.model.vo.Login;

public interface IUserDAO {

 public List<Login> selectMessage()throws DAOException;

}
