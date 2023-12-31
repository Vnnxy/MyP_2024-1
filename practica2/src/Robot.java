import java.util.ArrayList;
import java.util.Iterator;
/**
 * Class that represents the robot
 * @author equipo
 */
public class Robot {

    /*Arraylist for the burgers iterator*/
    private ArrayList<Iterator<Burger>> burgers;
    /*The sleep state */
    private RobotState sleep;
    /*The cook state */
    private RobotState cook;
    /*The walk state */
    private RobotState walk;
    /*The on state */
    private RobotState on;
    /*The displayMenuAndTakeOrder state */
    private RobotState displayMenuAndTakeOrder;
    /*The serve state */
    private RobotState serve;
    /*The current state */
    private RobotState currentState;
    /*The Burger to cook*/
    private Burger burger;
    /*The menu*/
    private String menu;

    /**
     * Builds a new Robot
     * @param arbitriary number of burger iterartors
     */
    @SuppressWarnings("unchecked")
    public Robot(Iterator<Burger> ... args){
	burgers = new ArrayList<>();
	for (Iterator<Burger> iterator : args)
	    burgers.add(iterator);
	sleep = new SleepState(this);
	cook = new CookingState(this);
	walk = new WalkingState(this);
	on = new ActiveState(this);
	displayMenuAndTakeOrder = new DisplayingAndTakingOrderState(this);
	serve = new ServingState(this);
	currentState= sleep;
	menu = getMenu();
    }

    /*private methos to save the menu*/
    private String getMenu(){
	StringBuffer sb = new StringBuffer();
	for (Iterator<Burger> iterator : burgers)
	    while (iterator.hasNext())
		sb.append(iterator.next()).append("\n");
	return sb.toString();
    }

    /**
     * Method that asks the robot to sleep.
     * 
     */
    public void sleep(){
	currentState.sleep();
    }

    /**
     * Method that asks the robot to cook.
     * 
     */
    public void cook(){
	currentState.cook();
    }

    /**
     * Method that asks the robot to walk.
     * 
     */
    public void walk(){
	currentState.walk();
    }

    /**
     * Method that asks the robot to turn on.
     * 
     */
    public void on(){
	currentState.on();
    }

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve(){
	currentState.serve();
    }

    /**
     * Method that asks the robot to display the menu and take order.
     * 
     */
    public void displayMenuAndTakeOrder(){
	currentState.displayMenuAndTakeOrder();
    }

    /**
     * Method that sets the current state.
     * @param state the RobotState 
     */
    public void setCurrentState(RobotState state){
	this.currentState = state;
    }

    /**
     * Method that gives the current state.
     * @return the current state 
     */
    public RobotState getCurrentState(){
	return this.currentState;
    }

    /**
     * Method that gives the walking state.
     * @return the walking state 
     */
    public RobotState getWalkingState(){
	return this.walk;
    }

    /**
     * Method that gives the cooking state.
     * @return the cooking state 
     */
    public RobotState getCookingState(){
	return this.cook;
    }

    /**
     * Method that gives the active state.
     * @return the active state 
     */
    public RobotState getActiveState(){
	return this.on;
    }

    /**
     * Method that gives the serving state.
     * @return the serving state 
     */
    public RobotState getServingState(){
	return this.serve;
    }

    /**
     * Method that gives the displayingAndTakingOrder state.
     * @return the displayingAndTakingOrder state 
     */
    public RobotState getDisplayingAndTakingOrderState(){
	return this.displayMenuAndTakeOrder;
    }

    /**
     * Method that gives the sleeping state.
     * @return the sleeping state 
     */
    public RobotState getSleepingState(){
	return this.sleep;
    }

    /**
     * prints the menu
     */
    public void printMenu(){
	System.out.println(menu);
    }

    /**
     * Method that sets the robot´s burger.
     * @param  the burger 
     */
    public void setBurger(Burger burger){
	this.burger = burger;
    }

    /**
     * Method that gets the robot´s burger.
     * @return  the burger 
     */
    public Burger getBurger(){
	return this.burger;
    }
    
    /**
     * Method that returns a String representation of the robot
     * @return String
     */
    public String toString(){
	return currentState.toString();
    }
    
}
