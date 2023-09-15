public class DisplayingAndTakingOrderState implements RobotState {
    private Robot robot;

    public DisplayingAndTakingOrderState(Robot robot) {
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
                "Sure, let me just bash into that wall... oh wait that's your forehead. Seriously I cant go any further.");
    }

    /**
     * Method that asks the robot to display the menu and take order.
     * 
     */
    public void displayMenuAndTakeOrder() {
        System.out.println("Here's the menu:");
        robot.setCurrentState(robot.getDisplayingAndTakingOrderState());
    }

    /**
     * Method that asks the robot to cook.
     * 
     */
    public void cook() {
        System.out.println(
                "I'd be cooking if you told me what you want");
    }

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve() {
        System.out.println("Taraa, here is some AIR. I don't even know what you want!");
    }

}
