package com.tester;

import java.util.List;

import com.code.student;

public class findspstud {

	public static student findspcustomer(String email,List<student>list)throws invalidexception{
		
		student s1=new student(email);
		int index=list.indexOf(s1);
		if(index==-1) {
			throw new invalidexception("Invalid email");
			
		}
		

		return s1;
		
		
		
	}
	
}
