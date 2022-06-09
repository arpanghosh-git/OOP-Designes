package stocktrading;

import java.util.ArrayList;

public class Cart implements Product {

	ArrayList<Product> cart=new ArrayList<Product>();
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	void addToCart(Product obj)
	{
		cart.add(obj);
	}
	
	void removeFromCart(Product obj)
	{
		cart.remove(obj);
	}
	
	void clearCart()
	{
		cart.clear();
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		int totalCost=0;
		for(Product obj:cart)
		{
			totalCost+=obj.getCost();
		}
		return totalCost;
	}

}
