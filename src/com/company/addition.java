package com.company;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
//Q1        Write a program to sum three numbers in Java.
        int a=5;
        int b=9;
        int c=8;
        int sum=a+b+c;
        System.out.println(sum);

        //Q2- Write a program to calculate CGPA using marks of three subjects (out of 100)
        float sub1=45;
        float sub2=95;
        float sub3=48;

        float cgpa=(sub1+sub2+sub3)/30;
        System.out.println(cgpa);



 //Q3-        Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

        System.out.println("what is your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("hello " + name +  "have a good day");

//Q4        Write a Java program to detect whether a number entered by the user is an integer or not.
        System.out.println("enter your number:");
        Scanner as=new Scanner(System.in);
        System.out.println(as.hasNextInt());



    }

}
