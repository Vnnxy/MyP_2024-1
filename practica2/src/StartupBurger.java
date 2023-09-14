public class StartupBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Travelling to Sillicon Valley... \n Got your protein!");
        return "Silicon valley fresh meat";
    }

    public String toString() {
        return "Startup Burger";
    }

    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Sure thing, addin cheese to become a UNICORN STARTUP BURGER, we could call it FTX...");
        else
            System.out.println("No cheese, just a startup burger");
    }
}
