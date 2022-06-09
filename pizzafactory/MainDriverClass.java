package pizzafactory;

import java.util.*;

public class MainDriverClass {

	public MainDriverClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaFactoryManager pizzaFactoryManager=new PizzaFactoryManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("1->ChickenPizza");
		System.out.println("2->CheesePizza");
		System.out.println("Enter your choice : ");
		int choice=sc.nextInt();
		pizzaFactoryManager.getOrder(choice);
		pizzaFactoryManager.setOrder();
		Pizza pizza=pizzaFactoryManager.deliveredOrder();
	}

}
