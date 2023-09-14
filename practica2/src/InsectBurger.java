public class InsectBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("I guess everyone has unique tastes. I acknowledge that, but you are disgusting ");
        return "Insect mashup";
    }

    public String toString() {
        return "Insect Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding it, Why not add cheese, said no one ever on earth.");
        else
            System.out.println("It could work, but I guess you are sticking with the safe option");
    }

}
