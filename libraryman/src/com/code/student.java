package com.code;

import java.time.LocalDate;

public class student implements Comparable<student> {

	private int redaerid;
	private String fname,lname,email,password;
	private LocalDate dob;
	private serviceplan plan;
	private static int idcounter;
	static {
		idcounter=1;
	}
	public student(int redaerid, String fname, String lname, String email, String password, LocalDate dob,
			String plan) {
		super();
		this.redaerid = idcounter++;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.plan = serviceplan.valueOf(plan);
	}
	
	
	//for duplicate check
	public  student(String email) {
		this.email=email;
	}


	public int getRedaerid() {
		return redaerid;
	}


	public void setRedaerid(int redaerid) {
		this.redaerid = redaerid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public serviceplan getPlan() {
		return plan;
	}


	public void setPlan(serviceplan plan) {
		this.plan = plan;
	}


	public static int getIdcounter() {
		return idcounter;
	}


	public static void setIdcounter(int idcounter) {
		student.idcounter = idcounter;
	}
	
	
	
	//equals method
	@Override
	public boolean equals(Object obj) {
	if(obj instanceof student) {
		student s1=(student)obj;
		return this.email.equals(((student) obj).email);
	}
		return false;
	}


	@Override
	public int compareTo(student o) {
	System.out.println("to compare");
		return this.email.compareTo(o.email);
	}


	@Override
	public String toString() {
		return "student [redaerid=" + redaerid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	
	
	
	
}
