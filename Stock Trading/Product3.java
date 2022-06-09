package stocktrading;

public class Product3 implements Product {

	int id;
	int cost;
	
	public Product3(int id, int cost) {
		super();
		this.id = id;
		this.cost = cost;
	}

	public Product3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}
