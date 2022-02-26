package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruck[] truckList = new FoodTruck[5];
		String inputTruckName;
		String inputFoodType;
		int inputTruckRating = 0;

		System.out.println("----HELLO----");
		System.out.println("Welcome to the FoodTruck App!");
		System.out.println("You may input information for up to 5 of your favorite food trucks!");
		System.out.println("To exit the input stream, enter \"quit\" instead of a food truck name.");
		System.out.println();

		for (int trucks = 0; trucks < 6; trucks++) {
			System.out.println("Please start by entering the name of the food truck: ");
			inputTruckName = kb.next();

			if (inputTruckName.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.println("Please tell me the type of food: ");
			inputFoodType = kb.next();
			System.out.println("Please provide a rating for this truck of 1-5: ");
			inputTruckRating = kb.nextInt();
			System.out.println("Thank you for your feedback!");

			FoodTruck newTruck = new FoodTruck(inputTruckName, inputFoodType, inputTruckRating);
			truckList[trucks] = newTruck;
		}

		FoodTruckApp app = new FoodTruckApp();
		app.mainMenu(truckList, kb);

	}

	private void mainMenu(FoodTruck[] truckList, Scanner kb) {
		int userChoice = 0;
		while (userChoice < 4) {
			System.out.println("Please choose an option from the menu!");
			System.out.println("1: List of Food Trucks: ");
			System.out.println("2: Average rating for trucks entered: ");
			System.out.println("3: Highest rated foodtruck: ");
			System.out.println("4: Quit");
			userChoice = kb.nextInt();

			if (userChoice == 1) {

				for (int trucks = 0; trucks < 6; trucks++) {
					if (truckList[trucks] == null) {
						break;
					} else {
						System.out.println(truckList[trucks]);
					}
				}
			} else if (userChoice == 2) {
				int sum = 0;
				int count = 0;
				double average = 0.0;
				for (int trucks = 0; trucks < 6; trucks++) {
					if (truckList[trucks] == null) {
						break;
					} else {
						sum += truckList[trucks].getTruckRating();
						count++;
					}
					average = ((double)(sum/count));
				}
				System.out.println("The average rating of the food trucks is: " + average);
			} else if (userChoice == 3) {
				int max = 0;
				int count = 0;
				for (int trucks = 0; trucks < 6; trucks++) {
					if (truckList[trucks] == null) {
						break;
					} else {
						if (truckList[trucks].getTruckRating() > max) {
							max = (int) truckList[trucks].getTruckRating();
							count = trucks;
						}
					}

				}
				System.out.println(truckList[count].toString());
			} else {
				System.out.println("You have chosen to quit. Buh Bye!");
			}
		}
	}
}
