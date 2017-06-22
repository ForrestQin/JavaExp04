package org.fkit.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;


public class Book implements Serializable {

	private Integer id;
	private String name;
	private String sid;
	private String sclass;
	private String date;
	
	

	public Book(String name, String sid, String sclass,String date) {
		this.name = name;
		this.sid = sid;
		this.sclass = sclass;
		this.date = date;
	}

	public Book() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", sid=" + sid + ", sclass=" + sclass + ", date=" + date + "]";
	}



}
