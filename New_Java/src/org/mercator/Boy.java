package org.mercator;

class Human{
	   //Overridden method
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}





	class Boy extends Human{
	   //Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   
	   
	   
	   public static void main( String args[]) {
	      
		   Human h=new Human();
		   h.eat();
		   
		   Boy obj = new Boy();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
	}