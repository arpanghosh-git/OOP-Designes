package pizzafactory;




// Concrete Builder
public class ChickenPizzaMaker implements PizzaMaker {

	Pizza pizza;
	
	public ChickenPizzaMaker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getOrder(int pizzaType) {
		// TODO Auto-generated method stub
		
		System.out.println("The order of chicken pizza is taken");
		this.makePizza();
	}

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		
		this.pizza=new ChickenPizza();
		this.pizza.setToppins();
		System.out.println("The order of chicken pizza is being prepared");
	}

	@Override
	public Pizza deliveredOrder() {
		// TODO Auto-generated method stub
		
		System.out.println("The order of chicken pizza is delivered");
		return this.pizza;
	}

}
