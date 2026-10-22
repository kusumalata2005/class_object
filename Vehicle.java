package com.tka;

public class Vehicle {

	    // 10 Variables
	
	    String brand;
	    String model;
	    int year;
	    String color;
	    double price;
	    int speed;
	    String fuelType;
	    String engineType;
	    int mileage;
	    boolean available;

	    // 4 Methods
	    
	    void displayVehicleDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }

	    void displayPrice() {
	        System.out.println("Price: " + price);
	    }

	    void displayPerformance() {
	        System.out.println("Speed: " + speed);
	        System.out.println("Mileage: " + mileage);
	    }

	    void displayStatus() {
	        System.out.println("Available: " + available);
	    }

	    
	    public static void main(String[] args) {

	        // Object Creation
	    	
	        Vehicle v = new Vehicle();

	      
	        v.brand = "Toyota";
	        v.model = "Fortuner";
	        v.year = 2025;
	        v.color = "White";
	        v.price = 4500000;
	        v.speed = 180;
	        v.fuelType = "Diesel";
	        v.engineType = "Petrol";
	        v.mileage = 12;
	        v.available = true;

	        // Method Calling
	        v.displayVehicleDetails();
	        v.displayPrice();
	        v.displayPerformance();
	        v.displayStatus();
	    }
	}

