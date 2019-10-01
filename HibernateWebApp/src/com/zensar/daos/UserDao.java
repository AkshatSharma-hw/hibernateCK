package com.zensar.daos;

import java.util.List;

import com.zensar.entities.*;
/**
* @author Chetna Khapre
* @version 2.0
* @creation_date 21st sep 2019 5.29PM
* @modification_date 28/09/2019 11:11 am
* @copyright Zensar technologies. All rights reserved
* @description it is data access object interface.
* 			   it is used in persistance layer of application.
*
*
*/

public interface UserDao {

	void insert(User user);
	void update(User user);
	void delete(User user);
	User getByUsername(String username);
	List<User>getAll();

}
