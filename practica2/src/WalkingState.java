/**
 * Class that represents the walking sate of the robot
 * @author equipo
 */
public class WalkingState implements RobotState {
    private Robot robot;

    /**
     * Builds a new state
     * @param robot the robot
     */
    public WalkingState(Robot robot) {
        this.robot = robot;
    }

    /**
     * Method that asks the robot to sleep.
     * 
     */
    public void sleep() {
        System.out.println("I was sleepy anyways...");
        robot.setCurrentState(robot.getSleepingState());
    }

    /**
     * Method that asks the robot to turn on.
     * 
     */
    public void on() {
        System.out.println("I´m already on and ready to go!");
    }

    /**
     * Method that asks the robot to wlak.
     * 
     */
    public void walk() {
        System.out.println("Im almost there... I'm here!!");
        robot.setCurrentState(robot.getDisplayingAndTakingOrderState());
    }

    /**
     * Method that asks the robot to display the menu and take order.
     * 
     */
    public void displayMenuAndTakeOrder() {
        System.out.println("I SAID I'M ALMOST THERE");
    }

    /**
     * Method that asks the robot to cook.
     * 
     */
    public void cook() {
        System.out.println(
                "I can't cook while walking. Please WAIT");
    }

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve() {
        System.out.println("Im not serving you yet!");
    }

    /**
     * Method that returns a String representation of the robot
     * @return String
     */
    public String toString(){
	return "Walking, running";
    }

}
