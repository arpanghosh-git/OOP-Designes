package pizzafactory;

public class PizzaFactoryManager {

	int pizzaType;
	PizzaMaker pizzaMaker;
	
	final int chickenPizza=1;
	final int cheesePizza=2;
	
	public PizzaFactoryManager() {
		// TODO Auto-generated constructor stub
	}
	
	void getOrder(int type)
	{
		this.pizzaType=type;
		if(this.pizzaType == chickenPizza)
			this.pizzaMaker=new ChickenPizzaMaker();
		else if(this.pizzaType == cheesePizza)
			this.pizzaMaker=new CheesePizzaMaker();
	}
	
	void setOrder()
	{
		this.pizzaMaker.getOrder(this.pizzaType);
	}
	
	Pizza deliveredOrder()
	{
		return this.pizzaMaker.deliveredOrder();
	}
	
}
