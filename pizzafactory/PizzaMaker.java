package pizzafactory;



// Abstract Builder
public interface PizzaMaker {
	void getOrder(int pizzaType);
	void makePizza();
	Pizza deliveredOrder();
}
