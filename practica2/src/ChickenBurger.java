public class ChickenBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("You definetely have taste, a classic, a chicken, a BURGER");
        return "Good old Chicken";
    }

    public String toString() {
        return "Chicken Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding cheese to create a delicious chicken parm");
        else
            System.out.println("No cheese for the weak and... for the chicken I guess");
    }
}
