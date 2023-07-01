package com.company;
import java.util.Scanner;
public class taking_input {
    public static <string> void main(String[] args) {
        System.out.println("taking user input");
        Scanner obj= new Scanner(System.in);//usr input s.in



      //  System.out.println("Enter first number:");

        //1.  int a=obj.nextInt();// obj call nextint() function
     //   System.out.println("Enter second number");
      //.  int b=obj.nextInt();
      //  int sum=a+b;


            //2.float y=obj.nextFloat();
           //float x=obj.nextFloat();
           //     float sum=x+y;

      //  System.out.println("the sum of these number is");
        //System.out.println(sum);


        //3.bool
        boolean b1=obj.hasNextInt();//check no.is int or not r-t/f
        System.out.println(b1);

        //4.string
      //  String  str=obj.next();//read one word
        String str2=obj.nextLine();
        System.out.println(str2);

    }
}

