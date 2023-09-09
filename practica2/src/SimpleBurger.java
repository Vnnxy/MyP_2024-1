public class SimpleBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("Simple and classic and..... boring, a piece of meat");
        return "Slice of meat";
    }
}
