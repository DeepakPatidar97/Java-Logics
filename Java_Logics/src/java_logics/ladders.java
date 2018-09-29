/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_logics;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Aditya is fond of ladders. Everyday he goes through pictures of ladders
 * online but unfortunately today he ran out of ladder pictures online. Write a
 * program to print “ladder with N steps”, which he can use to get his daily
 * dose of ladder love.
 *
 * INPUT: Input contains integer N, the number of steps in the ladder
 *
 * OUTPUT:
 *
 * Print the ladder with the gap between two side rails being 3 spaces(“ “).
 *
 * Check the sample output for format of printing the ladder.
 *
 * CONSTRAINTS:
 *
 * 1<=N<=40 input 2 output
 *
 *   *
 *   *
 *****
 *   *
 *   *
 *****
 *   *
 *   *
 *
 */
public class ladders {

    public static void main(String[] args) {
        ledder();
    }

    public static void ledder() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of ladders");
        int N = in.nextInt();
        for (int i = 1; i <= N * 3 + 2; i++) {
        if(i%3==0){
            for(int j=1;j<=5;j++){
            System.out.print("*");
        }
            System.out.println("");
        }
            if (i % 3 == 1 || i % 3 == 2) {
                System.out.println("*   *");
            }
        }
    }
}
