package Lesson4;
/*
 * Lesson 4 Coding Activity Question 1
 * 
 * Input two doubles and print them backwards on the screen.
 *
 * So if the user enters:
 
 1.3 6.8
 
 * It should output:
 
 6.8 1.3
 
 * Notice there is exactly one space between the numbers.
*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_4_Activity_One {
    public static void main(String[] args) {
      
    	double one;
    	double two;
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("Please enter two decimal numbers");
    	one = scan.nextDouble();
    	two = scan.nextDouble();
    	
    	System.out.println(two + " " + one);

    }
}