package java_logics;

import java.util.Scanner;

/**
 * Write a program to list all the integers between two integers L and R (including L and R). L and R can be any integer between 1 and 100. 

Instructions:

We have defined the integer variables L and R for you.
We have provided the code to get inputs for the variables.
Print all the integers between L and R (including L and R) with space between them
Sample Input: 
L = 5, R = 10

Sample Output: 
5 6 7 8 9 10
 */
public class Range_of_Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter The value of L and R");
        
        // Get L and R from the input
        int L = input.nextInt();
        int R = input.nextInt();
        
        for(int i=L;i<=R;i++){
            System.out.println(i);
        }
        
    }
}
