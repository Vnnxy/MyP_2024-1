/**
 * Class that represents the sleep sate of the robot
 * @author equipo
 */
public class ServingState implements RobotState {
    private Robot robot;

    /**
     * Builds a new state
     * @param robot the robot
     */
    public ServingState(Robot robot) {
        this.robot = robot;
    }

    /**
     * Method that asks the robot to sleep.
     * 
     */
    public void sleep() {
        System.out.println("I can't go to sleep now. I still have your dish");
    }

    /**
     * Method that asks the robot to turn on.
     * 
     */
    public void on() {
        System.out.println("Im on as you cant probably tell");
    }

    /**
     * Method that asks the robot to wlak.
     * 
     */
    public void walk() {
        System.out.println(
                "Sir, I can't go further, I have your burger ready");
    }

    /**
     * Method that asks the robot to display the menu and take order.
     * 
     */
    public void displayMenuAndTakeOrder() {
        System.out.println("You already made a choice. STICK with IT, it's already cooked");
    }

    /**
     * Method that asks the robot to cook.
     * 
     */
    public void cook() {
        System.out.println("You want to burn it?");

    }

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve() {
        System.out.println("Here you go!. Call me if you need something.");
	System.out.println("Im going back to the charge station, I´m sleepy");
        robot.setCurrentState(robot.getSleepingState());
    }

    /**
     * Method that returns a String representation of the robot
     * @return String
     */
    public String toString(){
	return "Ready to serve your burger";
    }

}
