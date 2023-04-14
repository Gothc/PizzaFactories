package com.pizzafactory;

import java.util.Scanner;

public class Main 
{ 
	public static void main(String[] args) 
	{
		Scanner  scan = new Scanner(System.in);
		System.out.print("what you want Veg OR Non-Veg Enter->(v/n): ");
		String choice = scan.next();
		 PizzaFactory p = new PizzaFactory(choice);
		 
		 if (choice.equals("v"))
		 {
			System.out.println("Your choice "+choice+" Veg");
			p.Veg();
		 }
		 else if(choice.equals("n"))
		 {
			System.out.println("Your choice "+choice+" Non-Veg");
			p.nonVeg();
		 }
		 else
		 {
			 System.out.println("please enter  one between v OR n");
		 }
		
	}
}
