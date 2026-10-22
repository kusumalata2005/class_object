package com.tka;

public class Student {

	    // 15 Variables
	    int id;
	    String name;
	    int age;
	    char gender;
	    String course;
	    String college;
	    int year;
	    double percentage;
	    String email;
	    String phone;
	    String city;
	    String state;
	    String address;
	    String department;
	    boolean active;

	    // 5 Methods
	    void displayStudent() {
	        System.out.println(id + " " + name);
	    }

	    void displayEducation() {
	        System.out.println(course + " " + college);
	    }

	    void displayContact() {
	        System.out.println(email + " " + phone);
	    }

	    void displayLocation() {
	        System.out.println(city + " " + state);
	    }

	    void displayStatus() {
	        System.out.println(active);
	    }

	   
	    public static void main(String[] args) {

	        // Object creation
	    	
	        Student s = new Student();

	       
	        s.id = 101;
	        s.name = "priya";
	        s.age = 21;
	        s.gender = 'f';
	        s.course = "B.Tech";
	        s.college = "GATE";
	        s.year = 4;
	        s.percentage = 8.0;
	        s.email = "priya@gmail.com";
	        s.phone = "9876543210";
	        s.city = "Pune";
	        s.state = "Maharashtra";
	        s.address = "Pune";
	        s.department = "CSE";
	        s.active = true;

	     
	        s.displayStudent();
	        s.displayEducation();
	        s.displayContact();
	        s.displayLocation();
	        s.displayStatus();
	    }
	
		

		
	}

