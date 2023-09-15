public class WalkingState implements RobotState {
    private Robot robot;

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
        System.out.println("Im almost there!!");
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
                "I ain't no mind reader. You look like you would order nuggets in a steak house, still, there are procedures.");
    }

    /**
     * Method that asks the robot to serve.
     * 
     */
    public void serve() {
        System.out.println("Im not serving you yet!");
    }

}
