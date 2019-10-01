package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Chetna Khapre
 * @version 2.0
 * @creation_date 21st sep 2019 5.23PM
 * @modification_date 28/09/2019 11:11 am
 * @copyright Zensar technologies. All rights reserved
 * @description Java bean class is used to represent database entity.
 * 				it is also used as value object.
 * 				it is used in all layers of application.
 *
 */

@Entity
@Table(name = "user_login")
public class User {
private String username;
private String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + "]";
}

	
}