package stocktrading;

public class Customer implements Person {

	int id;
	String name;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub

	}

}
