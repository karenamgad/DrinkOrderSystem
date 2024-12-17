public class DrinkFactory {
    public static Drink OrderDrink(String drinkType) {
        if(drinkType.equalsIgnoreCase("Coffee")) {
            return new Coffee();
        }
        else if(drinkType.equalsIgnoreCase("Tea")) {
            return new Tea();
        }
return null;


    }
}
