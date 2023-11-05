package com.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import static com.tester.validationrules.inputall;
import static com.tester.findspstud.findspcustomer;

import com.code.student;

public class tester1 {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<student> stud = new ArrayList<student>();

			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Choose  1 Signup \n 2 signin \n 3 display all \n 4 change password \n 5 sort by eamil \n  6 sort by fname\n"
								+ "7  removed sp reader \n   8 dispaly sp student details \n 0 exit");

				try {

					switch (sc.nextInt()) {

					case 1:
						System.out.println("sign up");
						System.out.println(
								"enter details int redaerid, String fname, String lname, String email, String password, LocalDate dob,\r\n"
										+ "			String plan");
						student s1 = inputall(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), stud);
						stud.add(s1);
						// System.out.println(s1);
						System.out.println("student added");
						break;

					case 2:
						System.out.println("sign in");
						System.out.println("Enter email and password");
						student s2 = new student(sc.next());
						boolean check = false;
						for (student s : stud) {
							if (s.equals(s2))
								check = true;

							System.out.println("Enter password");
							String s7 = sc.next();
							if (s.getPassword().contains(s7)) {
								System.out.println("Login successfully");
								System.out.println(s);
							}

						}
						break;

					case 3:
						System.out.println("display all");
						for (student s : stud) {
							System.out.println(s);

						}
						break;

					case 4:
						System.out.println("Enter email");
						student s11 = new student(sc.next());
						for (student s : stud) {
							if (s.equals(s11)) {
								System.out.println("enter password");
								if (s.getPassword().contains(sc.next())) {
									System.out.println("Enter new password");
									s.setPassword(sc.next());
									System.out.println("password changed successfully");
								}
							}
						}
						break;

					case 5:
						System.out.println("sort by email natural ordering");
						Collections.sort(stud);
						System.out.println(stud);

						break;

					case 6:

						Collections.sort(stud, new Comparator<student>() {
							@Override
							public int compare(student o1, student o2) {
								System.out.println("Custom ordering annomous comapte  to ");
								return o1.getFname().compareTo(o2.getFname());
							}
						});

						break;

					case 7:

						System.out.println("removed sp reader student");
						System.out.println("Enter email");
						boolean removed = stud.remove(new student(sc.next()));
						if (removed) {
							System.out.println("Removed successfully");{
						
							throw new invalidexception("Please enter valid email");
						}}
						break;

					case 8:
						System.out.println("Dispaly sp student");
						System.out.println("Enter email");
						System.out.println(findspcustomer(sc.next(), stud));

						break;

					case 0:
						System.out.println();
						exit = true;
						break;
					}

				} catch (Exception e) {
					System.out.println(e);

					e.printStackTrace();
					sc.nextLine();
				}

			}
		}

	}
}
