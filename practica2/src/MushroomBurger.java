public class MushroomBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Give me a sec... \n Here is your mushroom cow meat \n shift shift");
        return "Mushroom cow meat";
    }

    public String toString() {
        return "Mushroom Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Cheese and mushrooms coming up. A delicious combo!");
        else
            System.out.println("No cheese for this delicious burger");
    }
}
