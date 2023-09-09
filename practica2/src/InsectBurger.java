package practica2.src;

public class InsectBurger extends Burger {
    @Override
    public String prepareProtein() {
        System.out.println("I guess everyone has unique tastes. I acknowledge that, but you are disgusting ");
        return "Insect mashup";
    }
}
