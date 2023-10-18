/**
 * Class that represents the Latin Spanish language.
 * 
 * @author equipo.
 */
public class Latin implements Language {

    /**
     * Method that gives the welcome message
     * 
     * @return the message
     */
    public String welcome() {
        return "Bienvenidos a Cheemsmart, será un gusto atenderles.";
    }

    /**
     * Method that displays the main menu options
     * 
     * @return the options
     */
    public String menuOptions() {
        StringBuffer sb = new StringBuffer();
        sb.append("Por favor seleccionen una  opción: \n").append("\t 1.- Enseñar Catálogo \n");
        sb.append("\t 2.- Comprar \n").append("\t 3.- Cerrar sesión  \n").append("\t 0.- Salir \n");
        return sb.toString();
    }

    /**
     * Method that return a message to indicate that the user must write a valid
     * option
     * 
     * @return the message
     */
    public String validOption() {
        return "Por favor seleccionar una opción válida.";
    }

    /**
     * Method that displyas the add to cart menu, this menu is shown if the user
     * selects Buy in the main menu.
     * 
     * @return the menu
     */
    public String addToCart() {
        StringBuffer sb = new StringBuffer();
        sb.append("Escribir el id del producto para agregar al carrito o seleccionar una opción: \n");
        sb.append("\t 1.- Regresar \n").append("\t 2.- Pagar \n");
        return sb.toString();
    }

    /**
     * Method that displays the message for the safe sell, this message is shown
     * only if the user selects the pay option
     * 
     * @return the message
     */
    public String safeSell() {
        return "En Cheemsmart nos preocupamos por su seguridad, verifique su cuenta del banco:  \n";
    }

    /**
     * Method that displays the ticket
     * 
     * @return the ticket
     */
    public String ticket() {
        return "Su ticket: \n";
    }

    /**
     * Method that gives the deliver date
     * 
     * @return the date
     */
    public String deliverDate() {
        return "El producto llega el día: ";
    }

    /**
     * Method that displays the error message when the account does not match
     * 
     * @return the message
     */
    public String falseAccount() {
        return "Número equivocado, apgando el servicio.";
    }

    /**
     * Method that gives the thanks to the user.
     * 
     * @return the thanks message
     */
    public String thanks() {
        return "Gracias por tu compra, esperamos verte pronto!";
    }

    /**
     * Method that tells the user the bank contact.
     * 
     * @return The bank message
     */
    public String bank() {
        return "Por favor espera mientras verificamos tu método de pago.";
    }

    /**
     * Method that tells the user it can't buy the prodduct.
     * 
     * @return The message saying it has no money
     */
    public String notEnoughMoney() {
        return "No te sabes la de chambear?";
    }

    /**
     * Method that tells the current cart
     * 
     * @return The current cart
     */
    public String cart() {
        return "Tu carro de compras contiene:";
    }

    /**
     * Method that prints if the user has deal
     * 
     * @return If it has a deal
     */
    public String deal() {
        return "Tienes 20% de descuento en Alimentos! \\n" + " Recuerda que el descuento se aplica al final";
    }
}
