package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	long octalNumber=0;
	long decimalNumber=0;
	int i=0;

	Scanner input = new Scanner(System.in);
        System.out.println("Enter the octal number:");
        octalNumber=input.nextLong();
        long octalNumber1=octalNumber;
        while(octalNumber!=0){
            decimalNumber= (long) (decimalNumber+ (octalNumber%10) *Math.pow(8,i++));
             octalNumber=octalNumber/10;

        }
        System.out.println("the decimal number of "+octalNumber1+" is " + decimalNumber);
        System.out.println();
        // the other method
        int octal= 31;
        String octals= Integer.toString(octal);
         int deci= Integer.parseInt(octals,8);
        System.out.println(deci);

    }
}
