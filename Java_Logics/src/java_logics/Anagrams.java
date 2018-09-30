/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_logics;

import java.util.Scanner;

/**
 *Given two strings, a and b , that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.

Input :

test cases,t
two strings a and b, for each test case
Output:

Desired O/p

Constraints :

string lengths<=10000

Note :

Anagram of a word is formed by rearranging the letters of the word.

For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.
* 
* input 2 abc cde
* output 4
 */
public class Anagrams {

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0,count=0;
int count1[]=new int[26];
int count2[]=new int[26];
do
{
String s1=sc.next();
String s2=sc.next();
for(int k=0;k<s1.length();k++)
{
if(s1.charAt(k)>='A'&&s1.charAt(k)<='Z')
{
count1[s1.charAt(k)-'A']++;
}
else if(s1.charAt(k)>='a'&&s1.charAt(k)<='z')
{
count1[s1.charAt(k)-'a']++;
}
else if(s1.charAt(k)>=0&&s1.charAt(k)<=9)
{
count1[s1.charAt(k)-1]++;
}
}
for(int l=0;l<s2.length();l++)
{
if(s2.charAt(l)>='A'&&s2.charAt(l)<='Z')
{
count2[s1.charAt(l)-'A']++;
}
else if(s2.charAt(l)>='a'&&s2.charAt(l)<='z')
{
count2[s2.charAt(l)-'a']++;
}
else if(s2.charAt(l)>=0&&s2.charAt(l)<=9)
{
count2[s2.charAt(l)-1]++;
}
}
int result=0;
for(int m=0;m<26;m++)
{
result+=Math.abs(count1[m]-count2[m]);
}
System.out.println(result);
i++;
}
while(i<n);
}
}


