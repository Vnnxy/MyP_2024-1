public class UniqueBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Mooo \n Moo \n ... \n We got some fresh protein here");
        return "Tender meat";
    }

    public String toString() {
        return "Unique Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding cheese, no one would've thought of adding cheese to it.");
        else
            System.out.println("No cheese, got it.");
    }
}
