package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int sid;
	private String sname;
	private String techlang;
	
	
	public String getTechlang() {
		return techlang;
	}
	public void setTechlang(String techlang) {
		this.techlang = techlang;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", techlang=" + techlang + "]";
	}
	
	
	
	
	

}
