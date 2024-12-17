public class Main {
    public static void main(String[] args) {

        Drink drink = DrinkFactory.OrderDrink("Coffee");
        drink= new Chocolate(drink);
        drink=new Milk(drink);

        System.out.println("_".repeat(20));
        System.out.println("Drink Description: "+ drink.getDescription());
        System.out.println("Final Price: "+drink.cost());

        Drink drink2 = DrinkFactory.OrderDrink("Tea");
        drink2= new Milk(drink2);
        System.out.println("_".repeat(20));
        System.out.println("Drink Description: "+ drink2.getDescription());
        System.out.println("Final Price: "+drink2.cost());



    }
}