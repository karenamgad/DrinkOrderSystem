public class Chocolate extends DrinkDecorator{

    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return decoratedDrink.getDescription() + ", Chocolate";
    }

    @Override
    public double cost()
    {
        return decoratedDrink.cost() + 1.5;
    }
}
