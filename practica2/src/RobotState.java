/**
 * Interface that represents The States of the robot tht the robot will have.
 * 
 * @author equipo.
 */
public interface RobotState {

    /**
     * Method that asks the robot to sleep.
     * 
     */
    public void sleep();

    /**
     * Method that asks the robot to turn on.
     * 
     */
    public void on();

    /**
     * Method that asks the robot to wlak.
     * 
     */
    public void walk();

    /**
     * Method that asks the robot to display the menu and take order.
     * 
     */
    public void displayMenuAndTakeOrder();

    /**
     * Method that asks the robot to cook.
     * 
     */
    public void cook();

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve();

}
