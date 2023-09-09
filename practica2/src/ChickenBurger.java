public class ChickenBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("You definetely have taste, a classic, a chicken, a BURGER");
        return "Good old Chicken";
    }
}
