package com.skilldistillery.foodtruck;

public class FoodTruck {

	private String truckName;
	private String foodType;
	private int truckRating;
	private int truckID;
	private static int nextTruckID = 0;  
	
	public String toString() {
		String output = "Truck Name: " + truckName + ", Food Type: " + foodType + ", Truck Rating: " 
				+ truckRating + ", Truck ID: " + truckID;
		
		return output;
	}
	public FoodTruck() {	
	}
	
	public FoodTruck(String truckName, String foodType, int truckRating) {
		this.truckName = truckName; this.foodType = foodType; this.truckRating = truckRating;
		this.truckID = nextTruckID;
		nextTruckID++;
	}
	
	public String getTruckName() {
		return truckName;
	}
	public void setTruckName(String truckname) {
		this.truckName = truckname;
	}
	

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

	public void displayTrucks() {
		String truckData = toString();
		System.out.println(truckData);
	}
	}




