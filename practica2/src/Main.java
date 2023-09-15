import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Menu gen = new GeneralMenu();
	Menu day = new DailyMenu();
	Menu sp = new SpecialMenu();
	@SuppressWarnings("unchecked") Robot robot = new Robot(gen.iterator(),day.iterator(),sp.iterator());
	Scanner in = new Scanner(System.in);
	int option;
	System.out.println("**WElCOME**");
	while (true){
	    System.out.println("The robot is " + robot.toString());
	    System.out.println(
				"1.- Sleep.\n" +
				"2.- Turn on.\n" + 
				"3.- Walk.\n" + 
				"4.- Display menu and take order.\n" +
				"5.- Cook.\n" +
				"6.- Serve. \n" +
				"0.- Run out.\n");
	    System.out.println("Please choose an option: ");
	    try {
		String input = in.nextLine();
		option = Integer.parseInt(input);
		switch (option){
		case 1:
		    robot.sleep();
		    break;
		case 2:
		    robot.on();
		    break;
		case 3:
		    robot.walk();
		    break;
		case 4:
		    robot.displayMenuAndTakeOrder();
		    if (robot.getCurrentState() == robot.getDisplayingAndTakingOrderState()){
			System.out.println("Please enter the burger´s id of your choice: ");
			int id = 0;
			while (true){
			    try{
				String order = in.nextLine();
				id = Integer.parseInt(order);
				Burger b = getBurger(gen,day,sp,id);
				if (b != null){
				    robot.setBurger(b);
				    break;
				}
			    }
			    catch (NumberFormatException nfe){}
			    System.out.println("Please enter a valid id: ");
			    continue;
			}
			robot.setCurrentState(robot.getCookingState());
		    } 
		    break;
		case 5:
		    robot.cook();
		    break;
		case 6:
		    robot.serve();
		    break;
		case 0:
		    if (robot.getCurrentState() == robot.getSleepingState()){
			System.out.println("Goodbye!");
			return;
		    }
		    System.out.println("You can't leave right now");
		    continue;
		default:
		    System.out.println("That's an invalid option. Try again");
		    continue;
		}
		continue;
	    }
	    catch (NumberFormatException nfe){
		System.out.println("That's an invalid option. Try again");
	    }
	}
    }

    /*private methos to look up for the burger*/
    private static Burger getBurger(Menu a, Menu b, Menu c, int id){
	for (Burger burger : a)
	    if (burger.getId() == id)
		return burger;
	for (Burger burger : b)
	    if (burger.getId() == id)
		return burger;
	for (Burger burger : c)
	    if (burger.getId() == id)
		return burger;
	return null;
    }
}
