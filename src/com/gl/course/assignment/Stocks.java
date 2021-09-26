package com.gl.course.assignment;
import java.util.Scanner;

class Stocks {
	
	private double[] stockPrice;
	private boolean[] stockPriceMovement;
	private int numberOfCompanies;
	
	public void getSharePrice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of companies");
		numberOfCompanies = sc.nextInt();
		stockPrice = new double[numberOfCompanies];
		stockPriceMovement = new boolean[numberOfCompanies];
		
		for (int i=0; i < numberOfCompanies; i++) {
			System.out.println("Enter current stock price of the company " + (i+1));
			stockPrice[i] = sc.nextDouble();
			System.out.println("Did the share price increase today compared to yesterday?"
					+ " Please enter True or False ");
			stockPriceMovement[i] = sc.nextBoolean();
		}
		
		/*
		for (int i=0; i < numberOfCompanies; i++) {
			System.out.println("Stock price of company " + (i+1) + " is " + stockPrice[i]);
			System.out.println("Did the share price increase today compared to yesterday? " 
			+ stockPriceMovement[i]);
		}
		*/
		
		UserOperations obj = new UserOperations();
		obj.displayOperations(stockPrice, stockPriceMovement);
		
		sc.close();
	}
}
