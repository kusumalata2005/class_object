package com.tka;

public class Hospital {
	
	    // 10 Variables
	    String hospitalName;
	    String hospitalType;
	    String location;
	    int hospitalId;
	    int totalBeds;
	    int availableBeds;
	    String doctorName;
	    String department;
	    String contactNumber;
	    boolean emergencyAvailable;

	    // 5 Methods
	    void displayHospitalDetails() {
	        System.out.println("Hospital Name: " + hospitalName);
	        System.out.println("Hospital Type: " + hospitalType);
	        System.out.println("Location: " + location);
	    }

	    void displayHospitalId() {
	        System.out.println("Hospital ID: " + hospitalId);
	    }

	    void displayBeds() {
	        System.out.println("Total Beds: " + totalBeds);
	        System.out.println("Available Beds: " + availableBeds);
	    }

	    void displayDoctorDetails() {
	        System.out.println("Doctor Name: " + doctorName);
	        System.out.println("Department: " + department);
	    }

	    void displayEmergencyStatus() {
	        System.out.println("Emergency Available: " + emergencyAvailable);
	        System.out.println("Contact Number: " + contactNumber);
	    }

	   
	    public static void main(String[] args) {

	        // Object Creation
	        Hospital h = new Hospital();

	       
	        h.hospitalName = "Apollo Hospital";
	        h.hospitalType = "Multi-Speciality";
	        h.location = "Bhubaneswar";
	        h.hospitalId = 101;
	        h.totalBeds = 500;
	        h.availableBeds = 120;
	        h.doctorName = "Dr. Sharma";
	        h.department = "Cardiology";
	        h.contactNumber = "9876543210";
	        h.emergencyAvailable = true;

	       
	        h.displayHospitalDetails();
	        h.displayHospitalId();
	        h.displayBeds();
	        h.displayDoctorDetails();
	        h.displayEmergencyStatus();
	    }
	}


