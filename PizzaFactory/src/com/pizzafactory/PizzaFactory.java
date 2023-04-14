
package com.pizzafactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PizzaFactory 
{                            
	Scanner  scan = new Scanner(System.in);
 
   //price
   private int price;
  //Extra cheese
   private int ExtraCheese = 20; 
   //Crust type
   private String crusttype;
   //choice
   private String choiceVN;
   //veg pizza choice
   private String pizza_choice;
   //pizza type
   private String pizza_type1;
   //Veg topping
   private String veg_topping;
   //non_Veg topping
   private String nonveg_topping;
   //sides choice
   private String sides_choice1;
   //free toopings
   private String free_veg_topping1,free_veg_topping2,free_nonveg_topping1,free_nonveg_topping2;
   //Conform Order
   private String conformorder;
   
   //Order
   Map<String,Integer> order1 = new HashMap<>();
   
  //Order Method
   public void Order(String pizzaType2,String cheese)
   {
	   System.out.println("************ Your Order ************");
	   if(choiceVN.equals("v"))
	   {
		   System.out.println("You choiced Veg_Pizza is :- "+pizza_choice);
		   System.out.println("Pizza Type:- "+pizza_type1+" :Rs."+order1.get(pizza_type1));
		   System.out.println("Type of crust:- "+crusttype);
		   if(pizzaType2.equals("Large"))
		   {
			   System.out.println("Extra Free Veg_Toopings :- 1)"+free_veg_topping1+" :Rs."+0+"\n"
			   		                                        +"\t\t\t\t2)"+free_veg_topping2+" :Rs."+0);
		   }
		   else
		   {
			  System.out.println("Extra Veg_Toopings :- "+veg_topping+" :Rs."+order1.get(veg_topping));
		   }
		   if (cheese.equals("y")) 
		   {
			   System.out.println("Extra Chesse added : Rs."+ExtraCheese);
		   }
		   else
		   {
			   
		   }
		   System.out.println("Sides :-"+sides_choice1+" :Rs."+order1.get(sides_choice1));
		   System.out.println("Total Amount:-Rs."+price+"/-");
	   }
	   else
	   {
		   System.out.println("You choiced Non_Veg_Pizza is :- "+pizza_choice);
		   System.out.println("Pizza Type:-"+pizza_type1+" :Rs."+order1.get(pizza_type1));
		   System.out.println("Type of crust:- "+crusttype);
		   if(pizzaType2.equals("Large"))
		   {
			   System.out.println("Extra Free Non_Veg_Toopings :- 1)"+free_nonveg_topping1+" Rs.:"+0+"\n"
			   		                                        +"\t\t\t\t2)"+free_nonveg_topping2+" Rs.:"+0);
		   }
		   else
		   {
			   System.out.println("Extra Non_Veg_Toopings:- "+nonveg_topping+" :Rs."+order1.get(nonveg_topping));
		   }
		   if (cheese.equals("y")) 
		   {
			   System.out.println("Extra Chesse added : Rs."+ExtraCheese);
		   }
		   else
		   {
			   
		   }
		   System.out.println("Sides :-"+sides_choice1+" :Rs."+order1.get(sides_choice1));
		   System.out.println("Total Amount:- Rs."+price+"/-");
	   }
	   
   }
   
 //Order Conform Method
   public void ConformOrder() 
   {
	  System.out.print("If you want to conform order (y/n): ");
	  String conform1 = scan.next();
	  if(conform1.equals("y"))
	  {
		  System.out.println("Your order is Done,please wait few minutes");
		  System.out.println("Thanks For Order");
		  conformorder = "Done";
	  }
	  else
	  {
		  System.out.println("Your order is Not Done,Thanks for visit...");
		  conformorder = "Not Done";
	  }
   }
//constructor
   public PizzaFactory(String choiceVN) {
		super();
		this.choiceVN = choiceVN;
	}

//for R,M,L
public String RML(Map<String,Integer> arr) 
{
	System.out.print("which you want:\n"
			+ "  1)Regular: Rs."+arr.get("Regular")+" \n"
			+ "  2)Medium: Rs."+arr.get("Medium")+" \n"
			+ "  3)Large: Rs."+arr.get("Large")+"\n");
	System.out.print("Enter name which you want: ");
	String pizza_type = scan.next();
	//put in variable
	pizza_type1 = pizza_type;
	//put in order
	order1.put( pizza_type,arr.get(pizza_type));
	//Increases price
	price = arr.get(pizza_type);
	System.out.println("Your choice is: "+pizza_type);
	
	return pizza_type;
}

//Type of crust
public void crustType() 
{
	Map<Integer,String> crustType = new HashMap<Integer,String>();
	crustType.put(1,"New hand tossed");
	crustType.put(2,"Wheat thin crust");
	crustType.put(3,"Cheese Burst");
	crustType.put(4,"Fresh pan pizza");
	
   System.out.println("Which Type of crust you want:\n"
   		+ "   1)New hand tossed\n"
   		+ "   2)Wheat thin crust\n"
   		+ "   3)Cheese Burst\n"
   		+ "   4)Fresh pan pizza\n");
   System.out.print("Enter number which you want :");
   int option = scan.nextInt();
   crusttype =  crustType.get(option);
   System.out.println("Your choice : "+option+")"+crustType.get(option));
}
//Extra cheese
public String ExtraChessse()
{
	System.out.print("You want Extra cheese Rs "+ExtraCheese+" yes OR no (y/n): ");
	String extracheese = scan.next();
	if(extracheese.equalsIgnoreCase("y"))
	{
		System.out.println("Ok,Extra cheese added");
		price += ExtraCheese;
	}
	else
	{
		System.out.println("Ok,Not Extra cheese");
	}	
	return extracheese;
}

//Sides:
public void Sides()
{
	Map<String,Integer> sides = new HashMap<String,Integer>();
	sides.put("Cold_drink",55);sides.put("Mousse_cake",90);
	
	System.out.println("Sides:\n"
			+ "Cold_drink Rs."+sides.get("Cold_drink")+"\n"
			+ "Mousse_cake Rs."+sides.get("Mousse_cake")+"\n");
	System.out.print("Enter sides name: ");
	String sides_choice = scan.next();
	//put in variable
	sides_choice1 = sides_choice;
	//put in order
	order1.put(sides_choice,sides.get(sides_choice));
	//Increases price
	price += sides.get(sides_choice);
	System.out.println("You entered "+sides_choice+" Rs."+sides.get(sides_choice));
}

//veg Tippings list
	public String  vegTopping(Map<String,Integer> vegtoping)
	{
		System.out.println("Veg toppings:\n"
				+ "   1)Black_olive Rs."+vegtoping.get("Black_olive")+"\n"
				+ "   2)Capsicum Rs."+vegtoping.get("Capsicum")+"\n"
				+ "   3)Paneer Rs."+vegtoping.get("Paneer")+"\n"
				+ "   4)Mushroom Rs."+vegtoping.get("Mushroom")+"\n"
				+ "   5)Fresh_tomato Rs."+vegtoping.get("Fresh_tomato")+"\n");
	 //toppings choice
	 System.out.print("Enter Veg Toppings Name Which You Want : ");
	 String extra_veg_toppings= scan.next();
	 
	 return extra_veg_toppings;
	}
 
//Non_Veg Toppings List
  
//Extra toppings:
	public String  nonvegTopping(Map<String,Integer> non_vegtoping) 
	{
		System.out.println("Non-Veg toppings:\n"
				+ "   1)Black_olive Rs."+non_vegtoping.get("Black_olive")+"\n"
				+ "   2)Capsicum Rs."+non_vegtoping.get("Capsicum")+"\n"
				+ "   3)Mushroom Rs."+non_vegtoping.get("Mushroom")+"\n"
				+ "   4)Fresh_tomato Rs."+non_vegtoping.get("Fresh_tomato")+"\n"
				+ "   5)Chicken_tikka Rs."+non_vegtoping.get("Chicken_tikka")+"\n"
				+ "   6)Barbeque_chicken Rs."+non_vegtoping.get("Barbeque_chicken")+"\n"
				+ "   7)Grilled_chicken Rs."+non_vegtoping.get("Grilled_chicken")+"\n");
		
		//toppings choice
		 System.out.print("Enter Veg Toppings Name Which You Want : ");
		 String extra_nonveg_toppings= scan.next();	
		 return extra_nonveg_toppings;
	}
public void extraTopping(String c,String pizzaType)
{
	//v
	Map<String,Integer> vegtoping = new HashMap<String,Integer>();
	vegtoping.put("Black_olive",20);vegtoping.put("Capsicum",25);vegtoping.put("Paneer",35);
	vegtoping.put("Mushroom",30);vegtoping.put("Fresh_tomato",10);
	//n
	Map<String,Integer> non_vegtoping = new HashMap<String,Integer>(vegtoping);
	non_vegtoping.put("Chicken_tikka",35);non_vegtoping.put("Barbeque_chicken",45);
	non_vegtoping.put("Grilled_chicken",40);
	if(c.equals("v"))
	{//Veg
	 if (pizzaType.equals("Large")) 
	 {
		 System.out.println("##*****You Choice Large Pizza You got Two Toppings free****##");
		 String extra_veg_toppings_free1=vegTopping(vegtoping);
		 //put in variable
		 free_veg_topping1 = extra_veg_toppings_free1;
		 //put in order
		 order1.put(extra_veg_toppings_free1,vegtoping.get(extra_veg_toppings_free1));
		 System.out.println("You Entered "+extra_veg_toppings_free1+" Free Rs."+0);
		 String extra_veg_toppings_free2=vegTopping(vegtoping);
		 //put in variable
		 free_veg_topping2 = extra_veg_toppings_free2;
		 //put in order
		 order1.put(extra_veg_toppings_free2,vegtoping.get(extra_veg_toppings_free2));
		 System.out.println("You Entered "+extra_veg_toppings_free2+" Free Rs."+0);
	 }
	 else
	 {
		 String extra_veg_toppings=vegTopping(vegtoping);
		 //put in variable
		 veg_topping = extra_veg_toppings;
		 //put in order
		 order1.put(extra_veg_toppings,vegtoping.get(extra_veg_toppings));
		 //Increases price
		 price += vegtoping.get(extra_veg_toppings);
		 System.out.println("You Entered "+extra_veg_toppings+" Rs."+vegtoping.get(extra_veg_toppings));
	 }
	}
	else if(c.equals("n"))
	{//Non-veg
		if (pizzaType.equals("Large")) 
		{
			 System.out.println("##*****You Choice Large Pizza You got Two Toppings free****##");
			 String extra_nonveg_toppings1 = nonvegTopping(non_vegtoping);
			 //put in variable
			 free_nonveg_topping1 = extra_nonveg_toppings1;
			 //put in order
			 order1.put(extra_nonveg_toppings1,non_vegtoping.get(extra_nonveg_toppings1));
			 System.out.println("You Entered "+extra_nonveg_toppings1+" Free Rs."+0);
			 
			 String extra_nonveg_toppings2 = nonvegTopping(non_vegtoping);
			 //put in variable
			 free_nonveg_topping2 = extra_nonveg_toppings2;
			 //put in order
			 order1.put(extra_nonveg_toppings2,non_vegtoping.get(extra_nonveg_toppings2));
			 System.out.println("You Entered "+extra_nonveg_toppings2+" Free Rs."+0);
		}
		else
		{
			String extra_nonveg_toppings = nonvegTopping(non_vegtoping);
			 //put in variable
			 nonveg_topping = extra_nonveg_toppings;
			 //put in order
			 order1.put(extra_nonveg_toppings,non_vegtoping.get(extra_nonveg_toppings));
			 //Increases price
			 price += non_vegtoping.get(extra_nonveg_toppings);
			 System.out.println("You Entered "+extra_nonveg_toppings+" Rs."+non_vegtoping.get(extra_nonveg_toppings));
		}
	}
}
//for Veg
public void Veg() 
{
	 //Veg
	   Map<String,Integer> Deluxe_Veggie = new HashMap<>();
	   Deluxe_Veggie.put("Regular",150);Deluxe_Veggie.put("Medium",200);Deluxe_Veggie.put("Large",325);
	   
	   Map<String,Integer> Cheese_and_corn = new HashMap<>();
	   Cheese_and_corn.put("Regular",175);Cheese_and_corn.put("Medium",375);Cheese_and_corn.put("Large",475);
	   
	   Map<String,Integer> Paneer_Tikka = new HashMap<>();
	   Paneer_Tikka.put("Regular",160);Paneer_Tikka.put("Medium",290);Paneer_Tikka.put("Large",340);
	
	//veg choice
	Map<String,Map<String,Integer>>  choiceV = new HashMap<>();
	choiceV.put("Deluxe_Veggie",Deluxe_Veggie);
	choiceV.put("Cheese_and_corn",Cheese_and_corn);
	choiceV.put("Paneer_Tikka",Paneer_Tikka);
	
	System.out.println("Enter which you want:\n "
			+ "   1)Deluxe_Veggie\n "
			+ "   2)Cheese_and_corn\n "
			+ "   3)Paneer_Tikka");
	//input
	System.out.print("Enter name which you want : ");
	String veg_pizza_option = scan.next();
	//put in variable
	pizza_choice = veg_pizza_option;
	Map<String,Integer>  arr= choiceV.get(veg_pizza_option);
	System.out.println("Your choice : "+veg_pizza_option);

	//Regular,Medium,Large
    String pizza_type2=RML(arr);
    
    //crust
    crustType();
    
    //Toppings 
    extraTopping(choiceVN,pizza_type2);
    
    //Extra cheese
    String cheese2 = ExtraChessse();
    
    //Sides
    Sides();
    System.out.println("\n\n");
    //order
    Order(pizza_type2,cheese2);
    //conform order
    ConformOrder();
   
	
}

//for Non-Veg
public void nonVeg() 
{
	//Non-Veg
	Map<String,Integer>  Non_Veg_Supreme = new HashMap<>();
	Non_Veg_Supreme.put("Regular",190);Non_Veg_Supreme.put("Medium",325);Non_Veg_Supreme.put("Large",425);
	
	Map<String,Integer>  Chicken_Tikka = new HashMap<>();
	Chicken_Tikka.put("Regular",210);Chicken_Tikka.put("Medium",370);Chicken_Tikka.put("Large",500);
	
	Map<String,Integer>  Pepper_Barbecue_Chicken = new HashMap<>();
	Pepper_Barbecue_Chicken.put("Regular",220);Pepper_Barbecue_Chicken.put("Medium",380);Pepper_Barbecue_Chicken.put("Large",525);
	   
	//Non-veg choice
	Map<String,Map<String,Integer>>  choiceV = new HashMap<>();
	choiceV.put("Non_Veg_Supreme",Non_Veg_Supreme);
	choiceV.put("Chicken_Tikka",Chicken_Tikka);
	choiceV.put("Pepper_Barbecue_Chicken",Pepper_Barbecue_Chicken);
	
	System.out.println("Enter Number which you want:\n "
			+ "   1)Nonveg_Supreme\n "
			+ "   2)Chicken_Tikka\n "
			+ "   3)Pepper_Barbecue_Chicken");
	//input
	System.out.print("Enter name which you want : ");
	String nonveg_pizza_option = scan.next();
	//put in variable
	pizza_choice = nonveg_pizza_option;
	Map<String,Integer>  arr1= choiceV.get(nonveg_pizza_option);
	System.out.println("Your choice : "+nonveg_pizza_option);
	
	//Regular,Medium,Larger
    String pizza_type2 = RML(arr1);
    
    //crust 
    crustType();
    
    //extra Toppings
    extraTopping(choiceVN,pizza_type2);
    
    //Extra cheese
  	String cheese2=ExtraChessse();
  	
    //Sides
  	Sides();
  	System.out.println("\n\n");
  	//order
  	Order(pizza_type2,cheese2);
  	//Conform Order
  	ConformOrder();
}  

}
