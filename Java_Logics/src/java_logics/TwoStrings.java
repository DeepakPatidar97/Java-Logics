package java_logics;

import java.util.Scanner;

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
public class TwoStrings {
public static void main(String args[] ) throws Exception {
Scanner s = new Scanner(System.in);
int c = s.nextInt();
s.nextLine();
for(int i = 0;i<c;i++)
{
String s1 = s.next();
String s2 = s.next();
char[] a = s1.toCharArray();
char[] b = s2.toCharArray();
int r1 = 0;
int r2 = 0;
for(int j=0;j<a.length;j++)
{
r1 += a[j];
    System.out.println("r1 " +r1);
r2 += b[j];
System.out.println("r2 " +r2);
}
if(r1==r2)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
}