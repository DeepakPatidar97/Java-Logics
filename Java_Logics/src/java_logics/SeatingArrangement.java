/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_logics;

import java.util.Scanner;

/**
 *
 * 1 is opposite to 12, 6 is opposite to 7 --> All 4 of these are Window Seats
 * (WS) 2 is opposite to 11, 5 is opposite to 8 --> All 4 of these are Middle
 * Seats (MS) 3 is opposite to 10, 4 is opposite to 9 --> All 4 of these are
 * Aisle Seats (AS)
 */
public class SeatingArrangement {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int test = sc.nextInt();
String seatresult="";

for(int i=1 ; i<= test;i++)
{
seatresult = seatchecker(sc.nextInt());
System.out.println(seatresult);
}

}
static String seatchecker(int seatno)
{ String seat[] = {"","WS","MS","AS","AS","MS","WS","WS","MS","AS","AS","MS","WS"};
String str ="";
int remainder;

if(seatno>12)
{
remainder = seatno%12;
str = " "+(seat[remainder]);
if(remainder == 11)
{
return seatno - 9+str;
}
if(remainder == 10)
{
return seatno - 7+str;
}
if(remainder == 9)
{
return seatno - 5+str;
}
if(remainder == 8)
{
return seatno - 3+str;
}
if(remainder == 7)
{
return seatno - 1+str;
}
if(remainder == 6)
{
return seatno + 1+str;
}
if(remainder == 5)
{
return seatno + 3+str;
}
if(remainder == 4)
{
return seatno + 5+str;
}
if(remainder == 3)
{
return seatno + 7+str;
}
if(remainder == 2)
{
return seatno + 9+str;
}
if(remainder == 1)
{
return seatno + 11+str;
}
if(remainder == 0)
{
return seatno - 11+" WS";
}

}
else if(seatno<=12)
{

if(seatno==1)
{
return seatno + 11+" "+seat[seatno];
}
if(seatno==2)
{
return seatno + 9+" "+seat[seatno];
}
if(seatno==3)
{
return seatno + 7+" "+seat[seatno];
}
if(seatno==4)
{
return seatno + 5+" "+seat[seatno];
}
if(seatno==5)
{
return seatno + 3+" "+seat[seatno];
}
if(seatno==6)
{
return seatno + 1+" "+seat[seatno];
}
if(seatno==7)
{
return seatno - 1+" "+seat[seatno];
}
if(seatno==8)
{
return seatno - 3+" "+seat[seatno];
}
if(seatno==9)
{
return seatno - 5+" "+seat[seatno];
}

if(seatno==10)
{
return seatno - 7+" "+seat[seatno];
}

if(seatno==11)
{
return seatno - 9+" "+seat[seatno];
}

if(seatno==12)
{
return seatno - 11+" "+seat[seatno];
}

}
return "";
}
}


