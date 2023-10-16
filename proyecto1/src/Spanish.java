/**
 * Class that represents the Spanish language.
 * 
 * @author equipo.
 */
public class Spanish implements Language{

    /**
     * Method that gives the welcome message
     * 
     * @return the message
     */
    public String welcome(){
	return "Os damos la bienvenida a Cheemsmart, la vais a pasar increíble.";
    }

     /**
     * Method that displays the main menu options
     * 
     * @return the options
     */
    public String menuOptions(){
	StringBuffer sb = new StringBuffer();
	sb.append("Escoged una opción: \n").append("\t 1.- Mostrar Catálogo \n");
	sb.append("\t 2.- Comprar \n").append("\t 3.- Terminar sesión  \n").append("\t 0.- Salir \n");
	return sb.toString();
    }

     /**
     * Method that return a message to indicate that the user must write a valid option
     * 
     * @return the message
     */
    public String validOption(){
	return "Os invitamos a escojer una opción válida.";
    }

     /**
     * Method that displyas the add to cart menu, this menu is shown if the user selects Buy in the main menu.
     * 
     * @return the menu
     */
    public String addToCart(){
	StringBuffer sb = new StringBuffer();
	sb.append("Escribid la id del producto para agregar a vuestro carro o escoged una opción: \n");
	sb.append("\t 1.- Cerrar \n").append("\t 2.- Pasar por caja \n");
	return sb.toString();
    }

     /**
     * Method that displays the message for the safe sell, this message is shown only if the user selects the pay option
     * 
     * @return the message
     */
    public String safeSell(){
	return "Escribid la cuenta para verificar vuestra identidad:  \n";
    }

     /**
     * Method that displays the ticket
     * 
     * @return the ticket
     */
    public String ticket(){
	return "Vuestro ticket: \n";
    }

     /**
     * Method that gives the deliver date
     * 
     * @return the date
     */
    public String deliverDate(){
	return "Su entrega es el día: ";
    }

     /**
     * Method that displays the error message when the account does not match
     * 
     * @return the message
     */
    public String falseAccount(){
	return "Os hemos pillao, apagando el servicio";
    }
}
