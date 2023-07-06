package com.company;

import java.util.Scanner;

public class stud_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float  Total=500;
        System.out.println("Enter marks for 5 subjects");
        System.out.println("english");
        float a= sc.nextFloat();
        System.out.println("physics");
        float b=sc.nextFloat();
        System.out.println("Electronic");
        float c=sc.nextFloat();
        System.out.println("cpp");
        float d=sc.nextFloat();
        System.out.println("ds");
        float e=sc.nextFloat();

        float sum=a+b+c+d+e;

        System.out.println("the total sub is:");
        System.out.println(sum);

        float percentage=(sum/Total)*100;
        System.out.println("total marks is:");
        System.out.println(percentage);
    }
}
