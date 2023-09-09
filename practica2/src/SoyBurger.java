public class SoyBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Just cooking some tofu for you");
        return "Soy protein";
    }
}
