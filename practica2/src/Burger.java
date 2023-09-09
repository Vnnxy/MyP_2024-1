package practica2.src;

public abstract class Burger {

    public int id;
    public int price;
    public String description;
    public String name;
    public boolean hasCheese;
    public boolean isVegetarian;

    public void prepareBurger() {
        prepareBread();
        spreadMayonnaise();
        addMustard();
        addCheese();
        prepareProtein();
        String protein = prepareProtein();
        addProtein(protein);
        addCheese();
        addVeggies();
        addKetchup();
        addBread();
    }

    private void prepareBread() {
        System.out.println("Getting a bun and toasting it");
    }

    private void spreadMayonnaise() {
        System.out.println("Shlup, mayyonaise added");
    }

    private void addMustard() {
        System.out.println("Adding mustard, after all, life is all about spiciness");
    }

    public abstract String prepareProtein();

    private void addProtein(String protein) {
        System.out.println("After carefully cooking your" + protein + "time to assemble");
    }

    private void addCheese() {
        if (hasCheese)
            System.out.println("Melting the cheese and adding it for you");
        else
            System.out.println("No cheese for the weak");
    }

    private void addVeggies() {
        System.out.println("You got to eat your veggies, grandson");
    }

    private void addKetchup() {
        System.out.println("Adding ketchup");
    }

    private void addBread() {
        System.out.println("Now the other bun, and it's a BURGER");
    }

}
