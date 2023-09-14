public class SimpleBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Simple and classic and..... boring, a piece of meat");
        return "Slice of meat";
    }

    public String toString() {
        return "Simple Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("From a simple burger to a.... CHEESE burger, it'll be $15 now...");
        else
            System.out.println("It will remain as a simple burger");
    }
}
