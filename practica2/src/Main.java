public class Main {

    public static void main(String[] args) {
        Menu gen = new GeneralMenu();
	Menu day = new DailyMenu();
	Menu sp = new SpecialMenu();
	@SuppressWarnings("unchecked") Robot robot = new Robot(gen.iterator(),day.iterator(),sp.iterator());
	robot.printMenu();
    }

}
