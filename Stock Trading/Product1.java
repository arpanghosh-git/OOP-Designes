package stocktrading;

public class Product1 implements Product {

	int id;
	int cost;
	
	public Product1(int id, int cost) {
		super();
		this.id = id;
		this.cost = cost;
	}

	public Product1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

	
	
	

}
