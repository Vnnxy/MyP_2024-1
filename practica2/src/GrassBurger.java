public class GrassBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("This is a new one!, Cut some trees, add some beaaans and taraa!");
        return "Unique grass and beans";
    }

    public String toString() {
        return "Grass Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Grass and cheese, all you needed");
        else
            System.out.println("Thank god you are not putting cheese on that thing");
    }
}
