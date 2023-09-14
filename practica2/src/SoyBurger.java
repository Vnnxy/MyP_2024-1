public class SoyBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Just cooking some tofu for you");
        return "Soy protein";
    }

    public String toString() {
        return "Soy Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("With cheese, you won't be able to know the difference");
        else
            System.out.println("No cheese, just soy. Got it!");
    }
}
