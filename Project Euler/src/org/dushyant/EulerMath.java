package org.dushyant;

import java.util.ArrayList;
import java.util.List;

public class EulerMath {

	public static void sumOfMultiplesOF3Or5(String limit) {
		int sumOf3 = sumOf(3, limit);
		int sumOf5 = sumOf(5, limit);
		int sumOf15 = sumOf(15, limit);

		// int a =Integer.valueOf(limit);
		// int sum = 0;
		// for (int i = 1; i < a; i++) {
		// if (i % 3 == 0 || i % 5 == 0) {
		// sum = sum + i;
		// 	}
		// }
		
		System.out.println("Total Sum of all multiples of 3 and 5 are = " + (sumOf3 + sumOf5 - sumOf15));

	}

	private static int sumOf(int i, String limit) {
		int n = Integer.valueOf(limit) / i;
		return n * (n + 1) * i / 2;
	}

	public static List<Integer> getPrimeNumbersBelowGivenNumber(int number) {
		List<Integer> primeNumberList = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			if (isPrimeNumber(i)) {
				primeNumberList.add(i);
			}
		}
		
		System.out.print("Prime number List = ");
		for(int i=0;i<primeNumberList.size();i++){
			System.out.print(" " + primeNumberList.get(i));
		}
//	    System.out.println("Prime number List = " + primeNumberList);
		return primeNumberList;

	}

	private static boolean isPrimeNumber(int n) {
		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getLargestNumberForGivenDigits(int numberOfDigits) {
		String a="";
		for(int i=1;i<=numberOfDigits;i++){
			a=a+9;
		}
		return Integer.valueOf(a);
	}

	public static boolean isPalindrome(int product) {
		// checks if the number is a palindrome
		String productString=String.valueOf(product);
		StringBuilder builder = new StringBuilder(productString);
		String reverseProductString = builder.reverse().toString();
		
		
		return productString.equals(reverseProductString);
	}

	
	
	
}
