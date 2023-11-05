package com.tester;

import java.time.LocalDate;
import java.util.List;

import com.code.serviceplan;
import com.code.student;

public class validationrules {

	//for enum 
	public static serviceplan parseenum(String plan)throws invalidexception{
		return serviceplan.valueOf(plan);	
	}
	
	//for localdate
	
	public static LocalDate parsedate(String dob)throws invalidexception{
		
		LocalDate date1=LocalDate.parse(dob);
		LocalDate  checkdate=LocalDate.of(2001, 01, 01);
		if(date1.isBefore(checkdate)) {
			throw new invalidexception("date is before checkdate");
		}
		
		return date1;	
	}
	//duplicate check email pattern 
	
	public static void duplicate(String email,List<student>list)throws invalidexception{
		
		String pattern="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
		if(!email.matches(pattern)) {
			throw new invalidexception("pattern email not match");
					
		}
		
	student s1=new student(email);
	if(list.contains(s1)) {
		throw new invalidexception("Duplicate email");
	}
		
	}
	//validate all rules
	
	public static student inputall(int redaerid, String fname, String lname, String email, String password, String dob,
			String plan,List<student>list)throws invalidexception{
		serviceplan plan1=parseenum(plan);
		LocalDate date1=parsedate(dob);
		duplicate(email, list);
		
		
		return new student(redaerid, fname, lname, email, password, date1, plan);
	}
	
	
	
	
	
	
	
	
	
	
	
}
