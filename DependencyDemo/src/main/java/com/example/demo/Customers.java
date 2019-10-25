package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {

	private int custid;
	private String custname;
	private String coursename;
	
	@Autowired
	private Technologies techD;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public Technologies getTechD() {
		return techD;
	}
	public void setTechD(Technologies techD) {
		this.techD = techD;
	}
	public void display() {
		System.out.println("Customers object retured successfully!!");
		techD.techdetails();
	}
	
}
