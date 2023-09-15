public class CookingState implements RobotState {
    private Robot robot;

    public CookingState(Robot robot) {
        this.robot = robot;
    }

    /**
     * Method that asks the robot to sleep.
     * 
     */
    public void sleep() {
        System.out.println("I can't go to sleep now. I gotta earn some cash you know.");
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
                "Sir, I can't go further");
    }

    /**
     * Method that asks the robot to display the menu and take order.
     * 
     */
    public void displayMenuAndTakeOrder() {
        System.out.println("You already made a choice. STICK with IT");
    }

    /**
     * Method that asks the robot to cook.
     * 
     */
    public void cook() {
        System.out.println(
                "I'm going to cook the perfect dish");
        robot.setCurrentState(robot.getCookingState());
    }

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve() {
        System.out.println("I'm still making this masterpiece... oh it got a little bit burned. It's your fault.");
    }

}
