public class WagyuBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Teleporting to a farm in Japan...\n ...\n ... \n I'm back, now searing this.");
        return "A5 Wagyu";
    }

    public String toString() {
        return "Wagyu Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding cheese to overlap the delicousness of wagyu and ruining the burger");
        else
            System.out.println("No cheese! \n Thank you. Really");
    }
}
