/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_logics;

import java.util.*;

/**
 *Given two strings of equal length, you have to tell whether they both strings are identical.

Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

Input :

First line, contains an intger 'T' denoting no. of test cases.
Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
Output:

For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.
Constraints:

1<= T <=100
1<= |S1| = |S2| <= 10^5
String is made up of lower case letters only.
Note : Use Hashing Concept Only . Try to do it in O(string length) .

SAMPLE INPUT 
3
sumit mitsu
ambuj jumba
abhi hibb
* 
* 
SAMPLE OUTPUT 
YES
YES
NO
Explanation
For first test case,

mitsu can be rearranged to form sumit .

For second test case,

jumba can be rearranged to form ambuj .

For third test case,

hibb can not be arranged to form abhi.
 */
public class TwoStringSecond {
   public static void main(String arhs[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i=0;
while(i<n){
String s1=in.next();

String s2=in.next();
char w1[]=s1.toCharArray();
char w2[]=s2.toCharArray();
Arrays.sort(w1);
Arrays.sort(w2);
if(Arrays.equals(w1,w2))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
i++;
}
} 
}
