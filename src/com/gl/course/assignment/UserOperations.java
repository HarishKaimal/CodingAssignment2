package com.gl.course.assignment;
import java.util.Scanner;

public class UserOperations {
	private int operationChosen;
	
	public void displayOperations(double[] arr, boolean[] arr2) {
		
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
		
			System.out.println();
			System.out.println("--------------------------------------------------");
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			
			operationChosen = sc1.nextInt();
			
			switch(operationChosen) {
			case 1: 
				MergeSort ms = new MergeSort();
				ms.mergeSort(arr, 0, arr.length-1, 1);
				System.out.println("Stock prices in ascending order are: ");
				for(int i=0;i<arr.length;i++)
					System.out.print(arr[i] + " ");
				System.out.println();
				break;
			case 2:
				MergeSort ms1 = new MergeSort();
				ms1.mergeSort(arr, 0, arr.length-1, 2);
				System.out.println("Stock prices in descending order are: ");
				for(int i=0;i<arr.length;i++)
					System.out.print(arr[i] + " ");
				System.out.println();
				break;
			case 3:
				int sum = 0;
				for(int i=0; i<arr2.length; i++) {
					if(arr2[i]==true)
						sum++;
				}
				System.out.println("Total number of companies whose stock price rose today: " + sum);
				break;
			case 4:
				int sum1 = 0;
				for(int i=0; i<arr2.length; i++) {
					if(arr2[i]==false)
						sum1++;
				}
				System.out.println("Total number of companies whose stock price declined today: " + sum1);
				break;
			case 5:
				double searchPrice;
				int flag = 0;
				System.out.println("Please enter the price to be searched");
				searchPrice = sc1.nextDouble();
				for(int i=0; i<arr2.length; i++) {
					if(arr[i]==searchPrice) {
						System.out.println("Stock of value " + searchPrice + " is present ");
						flag = 1;
					}
				}
				if(flag == 0) {
					System.out.println("The price is not found");
				}
				break;
			}
			if (operationChosen == 0) {
				System.out.println("Exited application successfully.");
				break;
			}
		}
		
		sc1.close();
	}

}
