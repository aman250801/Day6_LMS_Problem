package com.lmsDay6;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenNumber {
	 public static void main(String[] args) {
		 
	        // Create an ArrayList of integers
		 
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);
	        numbers.add(30);
	        
	        // Calculate the sum of even numbers
	        
	        int sum = 0;
	        for (int number : numbers) {
	            if (number % 2 == 0) {
	                sum += number;
	            }
	        }
	        
	        // Print the sum of even numbers
	        
	        System.out.println("Sum of even numbers: " + sum);
	    }

}
