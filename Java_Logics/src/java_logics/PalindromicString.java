/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_logics;

import java.util.Scanner;

/**
 *You have been given a String S. You need to find and print whether this string is a palindrome or not. If yes, print "YES" (without quotes), else print "NO" (without quotes).

Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English alphabets only.

Output Format
Print the required answer on a single line.
 */
public class PalindromicString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String reverse="";
        int j = S.length()-1;
        for(int i=j;i>=0;i--){
            reverse = reverse + S.charAt(i);
        }
        if(S.equals(reverse)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
