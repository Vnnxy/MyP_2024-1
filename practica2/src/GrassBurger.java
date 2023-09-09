public class GrassBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("This is a new one!, Cut some trees, add some beaaans and taraa!");
        return "Unique grass and beans";
    }
}
