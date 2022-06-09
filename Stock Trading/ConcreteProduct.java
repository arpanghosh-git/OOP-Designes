package stocktrading;

import java.util.ArrayList;

public class ConcreteProduct implements Product {

	ArrayList<Product> product =new ArrayList<Product>();
	
	public ConcreteProduct() {
		// TODO Auto-generated constructor stub
	}

	public void addProduct(Product obj)
	{
		product.add(obj);
	}
	
	public void removeProduct(Product obj)
	{
		product.remove(obj);
	}
	
	void clearStock()
	{
		product.clear();
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCost(Product obj) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
	public Product getProduct(int i)
	{
		return product.get(i);
	}
	
	public int getProductQuantity(Product obj)
	{
		int count=0;
		for(Product obj1:product)
		{
			if(obj instanceof Product1)
				count+=1;
		}
		return count;
	}
}
