package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] words = new String[5];
		//2. print the third element in the array
		System.out.println(words[2]);
		//3. set the third element to a different value
		words[2] = "hello";
		//4. print the third element again
		System.out.println(words[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < numbers.length; i++) {
			Random ran = new Random();
			numbers[i] = ran.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallestNumber) {
				smallestNumber = numbers[i];
			}
		}
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(numbers));
		//10. print the largest number in the array.
		int largestNumber = numbers[0];
		for(int i = 1; i < numbers.length; i++) 
			if (numbers[i] < largestNumber) {
				largestNumber = numbers[i];
			}
	}
}
