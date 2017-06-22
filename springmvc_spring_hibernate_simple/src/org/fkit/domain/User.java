package org.fkit.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 * CREATE TABLE tb_user(
id INT PRIMARY KEY AUTO_INCREMENT,      #id
loginname VARCHAR(50) UNIQUE,		#登录名 邮箱
PASSWORD VARCHAR(18),			#密码
username VARCHAR(18),			#用户名
phone VARCHAR(18),			#电话
address VARCHAR(255),			#地址
sid VARCHAR(255),
sclass VARCHAR(255)
);

insert into tb_user(loginname,password,username,phone,address) values('jack','123456','杰克','13920001234','广州市天河区');

 * */
@Table(name = "t_user_ssh")
@Entity
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;			// id
	private String password;	// 密码
	private String userName;	// 用户名
	private String sid;
	private String sclass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", userName="
				+ userName + "]";
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	
	
}
