public class StartupBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Travelling to Sillicon Valley... \n Got your protein!");
        return "Silicon valley fresh meat";
    }
}
