package com.tka;

public class Employee {

//	variables
	int id;
	String name;
	int age;
	char gender;
	int year;
	int experience;
	String city;
	String state;
	String email;
	int phone;
	String department;
	String address;
	boolean active;
	
//	methods
	
	void displayEmployee() {
		System.out.println(id + " "+ name);
	}
	
	void displaypersonalinfo() {
		System.out.println(age +" "+ gender);
	}
	void displayexperience() {
		System.out.println(year + " " + experience);	
	}
	void displaylocation() {
		System.out.println(state + " "+ city);
	}
	void displaycontact() {
		System.out.println(email + " "+ phone);
	}
	void displaystatus() {
		System.out.println(active);
	}
	
	
	public static void main(String[] args) {
		
		Employee E = new Employee();
		
		E.id=101;
		E.name="priya";
		E.age = 22;
		E.gender='f';
		E.year=2005;
		E.experience=2;
		E.city="pune";
		E.state="maharastra";
		E.email="priya@gmail.com";
		E.phone=873647258;
		E.department="electrical";
		E.address="pune";
	    E.active=true;
	    
	    
	    E.displayEmployee();
	    E.displaypersonalinfo();
	    E.displayexperience();
	    E.displaylocation();
	    E.displaycontact();
	    E.displaystatus();		
			
	}
}
