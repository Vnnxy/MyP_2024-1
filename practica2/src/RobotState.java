/**
 * Interface that represents The States of the robot tht the robot will have.
 * 
 * @author equipo.
 */
public interface RobotState {

    public void sleep();

    public void on();

    public void walk();

    public void displayMenuAndTakeOrder();

    public void cook();

    public void serve();

}
