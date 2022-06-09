package stocktrading;

import java.util.HashMap;

//import com.sun.tools.javac.util.Pair;

public class SellDetails {

	HashMap<Person,Cart> sellMap=new HashMap<Person,Cart>();
	//Pair<Person,Cart> sellMap[]=new Pair<Person,Cart>();
	public SellDetails() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellDetails sellDetails=new SellDetails();
		ConcreteProduct concreteProduct=new ConcreteProduct();
		concreteProduct.addProduct(new Product1(1,50));
		concreteProduct.addProduct(new Product2(2,35));
		concreteProduct.addProduct(new Product3(3,20));
		concreteProduct.addProduct(new Product1(4,18));
		concreteProduct.addProduct(new Product1(5,43));
		concreteProduct.addProduct(new Product3(6,45));
		concreteProduct.addProduct(new Product3(7,50));
		concreteProduct.addProduct(new Product3(8,59));
		concreteProduct.addProduct(new Product2(9,30));
		concreteProduct.addProduct(new Product2(10,40));
		concreteProduct.addProduct(new Product1(11,60));
		concreteProduct.addProduct(new Product2(12,60));
		concreteProduct.addProduct(new Product2(13,80));
		concreteProduct.addProduct(new Product1(14,20));
		concreteProduct.addProduct(new Product3(15,40));
		
		Customer c1=new Customer(1,"Abc");
		Customer c2=new Customer(2,"Bcd");
		Cart cart1=new Cart();
		cart1.addToCart(concreteProduct.getProduct(2));
		cart1.addToCart(concreteProduct.getProduct(6));
		cart1.addToCart(concreteProduct.getProduct(4));
		
		Cart cart2=new Cart();
		cart2.addToCart(concreteProduct.getProduct(4));
		cart2.addToCart(concreteProduct.getProduct(3));
		cart2.addToCart(concreteProduct.getProduct(12));
		
		sellDetails.sellMap.put(c1, cart1);
		sellDetails.sellMap.put(c2, cart2);
		
	}

}
