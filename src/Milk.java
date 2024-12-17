public class Milk extends DrinkDecorator {
    public Milk(Drink drink) {
        super(drink);
}
@Override
public String getDescription() {
    return decoratedDrink.getDescription() + ", Milk";
    }
    @Override
    public double cost() {
        return decoratedDrink.cost() + 0.5;
    }
}
