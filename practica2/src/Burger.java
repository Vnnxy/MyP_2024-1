import java.util.Scanner;

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
        String protein = prepareProtein();
        addProtein(protein);
        askCustomerCheese();
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
        System.out.println("After carefully cooking your " + protein + " and it's time to assemble");
    }

    public abstract void addCheese();

    public void askCustomerCheese() {
        String message = "Burgers usually have cheese in them, would you like some? \n [yes]   [no]";
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();

        if (response.equals("yes")) {
            hasCheese = true;
        } else if (response.equals("no"))
            hasCheese = false;
        else {
            System.out.println("I don't understand, is it a yes or a no?");
            askCustomerCheese();
        }

    }

    private void addVeggies() {
        System.out.println("You got to eat your veggies said grandma");
    }

    private void addKetchup() {
        System.out.println("Adding ketchup");
    }

    private void addBread() {
        System.out.println("Now the other bun, and it's a BURGER");
    }

    public abstract String toString();

}
