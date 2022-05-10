package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_login")
@Setter
@Getter
public class Login {
@Id
private String emailid;
private String password;
@Column(name="typeofuser")
private String typeOfUser;
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTypeOfUser() {
	return typeOfUser;
}
public void setTypeOfUser(String typeOfUser) {
	this.typeOfUser = typeOfUser;
}
@Override
public String toString() {
	return "Login [emailid=" + emailid + ", password=" + password + ", typeOfUser=" + typeOfUser + "]";
}

}