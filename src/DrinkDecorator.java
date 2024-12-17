public abstract class DrinkDecorator implements Drink {
Drink decoratedDrink;

public DrinkDecorator(Drink drink) {
    this.decoratedDrink = drink;
}
@Override
    public String getDescription() {
    return decoratedDrink.getDescription();
}

    @Override
    public double cost() {
        return decoratedDrink.cost();
    }
}
