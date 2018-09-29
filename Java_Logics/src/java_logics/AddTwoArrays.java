/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_logics;

/**
 *Add two arrays
Write a program to add the corresponding elements of two arrays, each of size N and print the sums. N can be any integer between 1 and 100. 
1<=N<=1000
Instructions:

We have defined an integer variable N for you.
We have provided the code to get the input for variable N.
We have defined integer arrays numArray1[N],  numArray1[N]and sumArray[N].
We have provided the code to get the input for the array elements.
You have to write the logic to add the array elements.
Store the sum values in respective elements of variable sumArray[N],
Print all the elements of sumArray with space between them
* 
* Sample Input:
N = 3 
numArrayA[] = 3 9 8
numArrayB[] = 8 12 74

Sample Output:
11 21 82
 */
import java.util.Scanner;

public class AddTwoArrays {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Reading integer from input
		int N = s.nextInt();
		
		int[] numArrayA = new int[N];
		int[] numArrayB = new int[N];
		int[] sumArray = new int[N];
				
		// Read numArray1
		for(int i=0; i<N; i++) {
			numArrayA[i] = s.nextInt();
		}
		// Read numArray2
		for(int i=0; i<N; i++) {
			numArrayB[i] = s.nextInt();
		}
		
		// Write your logic here:
		
		for(int i=0;i<N;i++){
                    sumArray[i] = numArrayA[i]+numArrayB[i];
                }
				
		
		// Print the sumArray
		for(int i=0; i<N; i++) {
			System.out.print(sumArray[i] + " ");
		}
        
        System.out.println();
		s.close();

	}

}