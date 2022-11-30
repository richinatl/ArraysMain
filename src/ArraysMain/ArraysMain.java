package ArraysMain;

import java.util.Arrays;
import java.util.*;

public class ArraysMain {

	public static void main(String[] args) {
//		Write a program to sum all the values of a given Array in Java.
//		What is the output?
		
		int [] exampleArr = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		for ( int numbers : exampleArr) {
			sum = sum + numbers;
		}
				
		System.out.println("The total is : " + sum);
		
	}

}
