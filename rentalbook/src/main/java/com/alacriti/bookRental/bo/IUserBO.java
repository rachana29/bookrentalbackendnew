package com.alacriti.bookRental.bo;
import java.util.List;

import com.alacriti.bookRental.bo.impl.BOException;
import com.alacriti.bookRental.model.vo.Login;
public interface IUserBO {
	List<Login> retrieveMessage() throws BOException;
}
