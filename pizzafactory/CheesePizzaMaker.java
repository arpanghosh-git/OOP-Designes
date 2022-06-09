package pizzafactory;




//Concrete Builder
public class CheesePizzaMaker implements PizzaMaker {

	Pizza pizza;
	
	public CheesePizzaMaker() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getOrder(int pizzaType) {
		// TODO Auto-generated method stub
		
		System.out.println("The order of cheese pizza is taken");
		this.makePizza();
	}

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		
		this.pizza=new CheesePizza();
		this.pizza.setToppins();
		System.out.println("The order of cheese pizza is being prepared");
	}

	@Override
	public Pizza deliveredOrder() {
		// TODO Auto-generated method stub
		
		System.out.println("The order of cheese pizza is delivered");
		return this.pizza;
	}

}
