/********************************************
 * Module 2
 * Assignment 3
 * By Karolina Szulczyk
 * This program prints an isosceles triangle.
 ********************************************/

package Triangles;
import java.util.Scanner;
public class Triangles 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
	      System.out.println(
	    		  "Enter the size of the equal sides in an isosceles triangle ");
	      int sideSize = stdIn.nextInt();
	      for (int i = 1; i <= sideSize; i++)		// loop for given sideSize
	      {
	         for (int j = sideSize; j >= i; j--)	//loop for spaces before stars
	         {
	            System.out.print(" ");
	         }
	         for (int j = 1; j <= i; j++)				//to print number of stars per row
	         {
	            System.out.print("* ");
	         }
	         System.out.println();					//for new line after printing each row
	      }    
	}// end main
}// end Isosceles Triangle
