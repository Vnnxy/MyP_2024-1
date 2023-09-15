/**
 * Class that represents the sleep sate of the robot
 * @author equipo
 */
public class SleepState implements RobotState {
    private Robot robot;

    /**
     * Builds a new state
     * @param robot the robot
     */
    public SleepState(Robot robot) {
        this.robot = robot;
    }

    /**
     * Method that asks the robot to sleep.
     * 
     */
    public void sleep() {
        System.out.println("Zzz... Zzz ... Zzz ... Zzz ... Zzz... Zzz ... Zzz ... Zzz");
    }

    /**
     * Method that asks the robot to turn on.
     * 
     */
    public void on() {
        System.out.println("Initializing ... \n Charging Complete. \n Robot is ON");
        robot.setCurrentState(robot.getActiveState());
    }

    /**
     * Method that asks the robot to wlak.
     * 
     */
    public void walk() {
        System.out.println("Zzz.. Im currently sleeping, first you gotta turn me on... wait... nevermind");
    }

    /**
     * Method that asks the robot to display the menu and take order.
     * 
     */
    public void displayMenuAndTakeOrder() {
        System.out.println("I can't show you anything whilst I'm asleep.");
    }

    /**
     * Method that asks the robot to cook.
     * 
     */
    public void cook() {
        System.out.println("I'm sleeping, cooking some pasta with remi.");
    }

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve() {
        System.out.println("I'm sleeping, learn how to use the menu... Serves you right!");
    }

    /**
     * Method that returns a String representation of the robot
     * @return String
     */
    public String toString(){
	return "Sleeping Zzz";
    }

}
