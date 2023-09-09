package practica2.src;

public class UniqueBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Mooo \n Moo \n ... \n We got some fresh protein here");
        return "Tender meat";
    }
}
