
/**
 * Main class, where thr user interacts with the system
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		Soldier s1 = new Private("1");
		Soldier s2 = new Private("2");
		Soldier s3 = new Private("3");
		Soldier s4 = new Private("4");
		Soldier s5 = new Private("5");
		Soldier s6 = new Private("6");
		Soldier s7 = new Private("7");
		Soldier s8 = new Private("8");
		Soldier s9 = new Private("9");
		Soldier s10 = new Private("10");
		Soldier s11 = new Private("11");
		Soldier s12 = new Private("12");
		Soldier s13 = new Private("13");
		Soldier s14 = new Private("14");
		Soldier s15 = new Private("15");
		Soldier t1 = new Lieutenant("1");
		Soldier t2 = new Lieutenant("2");
		Soldier t3 = new Lieutenant("3");
		Soldier t4 = new Lieutenant("4");
		Soldier t5 = new Lieutenant("5");
		Soldier t6 = new Lieutenant("6");
		/* Initialized an arbitrary cheem adaptator */
		CheemsSoldado cheemsSoldier = new CheemsSoldado("Cheems", 444);
		Soldier cheems = new CheemsListensToUncleSam(cheemsSoldier, false, false, "444", "Get up");
		t1 = new KevlarArmor(t1);
		t4 = new GrapheneArmor(t4);
		t6 = new DragonSlayerSword(t6);
		Soldier c1 = new Captain("1", "alpha");
		Soldier c2 = new Captain("2", "betta");
		Soldier c3 = new Captain("3", "charlie");
		c1 = new IronCheems(c1);
		c2 = new LaserBeam(new TankArmor(c2));
		t1.addSoldier(s1);
		t1.addSoldier(s2);
		t1.addSoldier(s3);
		t2.addSoldier(s4);
		t2.addSoldier(s5);
		t3.addSoldier(s6);
		t3.addSoldier(s7);
		t4.addSoldier(s8);
		t4.addSoldier(s9);
		t4.addSoldier(s10);
		t5.addSoldier(s11);
		t5.addSoldier(s12);
		t6.addSoldier(s13);
		t6.addSoldier(s14);
		t6.addSoldier(s15);
		c1.addSoldier(t1);
		c1.addSoldier(t2);
		c2.addSoldier(t3);
		c2.addSoldier(t4);
		c3.addSoldier(t5);
		c3.addSoldier(t6);
		c1.relayOrder(c1.getFormation());
		c2.relayOrder(c2.getFormation());
		c3.relayOrder(c3.getFormation());
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please choose an option: ");
			System.out.println("1.- Equip a new Soldier.");
			System.out.println("2.- Report Batallions");
			System.out.println("3.- Equip Cheems");
			System.out.println("0.- Quit");
			try {
				String input = sc.nextLine();
				int option = Integer.parseInt(input);
				switch (option) {
					case 1:
						buildNewSoldier(sc);
						break;
					case 2:
						reportBatallions(c1, c2, c3, s1, sc, cheems);
						break;
					case 3:
						System.out.println("Cheems has decided to become a Lieutenant");
						cheems.setIsLieutenant(true);
						cheems.setIsCaptain(false);
						cheems = equipCheems(sc, cheems);
						System.out.println("Adding cheem to the first batallion");
						c1.addSoldier(cheems);
						c1.relayOrder(c1.getFormation());
						c1.report();
						break;
					case 0:
						sc.close();
						return;
					default:
						System.out.println("Please write a valid option");
						continue;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Please write a valid option");
				continue;
			}
		}
	}

	/* Private method to display the soldier menu */
	private static void buildNewSoldier(Scanner sc) {
		System.out.println("Please write the soldier's id: ");
		String input = sc.nextLine();
		Soldier soldier;
		while (true) {
			System.out.println("Select an option for your new soldier: ");
			System.out.println("1.- Private");
			System.out.println("2.- Lieutenant");
			System.out.println("3.- Captain");
			try {
				String s = sc.nextLine();
				int option = Integer.parseInt(s);
				switch (option) {
					case 1:
						soldier = new Private(input);
						break;
					case 2:
						soldier = new Lieutenant(input);
						break;
					case 3:
						System.out.println("please write the battle formation: ");
						String formation = sc.nextLine();
						soldier = new Captain(input, formation);
						break;
					default:
						System.out.println("Please write a valid option");
						continue;
				}
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Please write a valid option");
				continue;
			}
		}
		while (true) {
			System.out.println("Your soldier status: ");
			System.out.println(soldier.toString());
			System.out.println("Please choose a gear for your soldier: ");
			System.out.println("1.- Kevlar Armor");
			System.out.println("2.- Graphene Armor");
			System.out.println("3.- Tank Armor");
			System.out.println("4.- Dragon Slayer Sword");
			System.out.println("5.- Potato Gun");
			System.out.println("6.- Laser Beam");
			System.out.println("7.- Chicken Wings");
			System.out.println("8.- Giant Frog Legs");
			System.out.println("9.- Turbine");
			System.out.println("10.- Iron Cheems");
			System.out.println("0.- Quit");
			try {
				String ans = sc.nextLine();
				int opt = Integer.parseInt(ans);
				switch (opt) {
					case 1:
						soldier = new KevlarArmor(soldier);
						break;
					case 2:
						soldier = new GrapheneArmor(soldier);
						break;
					case 3:
						soldier = new TankArmor(soldier);
						break;
					case 4:
						soldier = new DragonSlayerSword(soldier);
						break;
					case 5:
						soldier = new PotatoGun(soldier);
						break;
					case 6:
						soldier = new LaserBeam(soldier);
						break;
					case 7:
						soldier = new ChickenWings(soldier);
						break;
					case 8:
						soldier = new GiantFrogLegs(soldier);
						break;
					case 9:
						soldier = new Turbine(soldier);
						break;
					case 10:
						soldier = new IronCheems(soldier);
						break;
					case 0:
						return;
					default:
						System.out.println("Please write a valid option");
						continue;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Please write a valid option");
				continue;
			}
		}
	}

	/* Private method to display the cheems menu */
	private static Soldier equipCheems(Scanner sc, Soldier cheemsSoldier) {
		Soldier soldier = cheemsSoldier;

		while (true) {
			System.out.println("Your cheems status: ");
			System.out.println(soldier.toString());
			System.out.println("Please choose a gear for Cheems: ");
			System.out.println("1.- Kevlar Armor");
			System.out.println("2.- Graphene Armor");
			System.out.println("3.- Tank Armor");
			System.out.println("4.- Dragon Slayer Sword");
			System.out.println("5.- Potato Gun");
			System.out.println("6.- Laser Beam");
			System.out.println("7.- Chicken Wings");
			System.out.println("8.- Giant Frog Legs");
			System.out.println("9.- Turbine");
			System.out.println("10.- Iron Cheems");
			System.out.println("0.- Quit");
			try {
				String ans = sc.nextLine();
				int opt = Integer.parseInt(ans);
				switch (opt) {
					case 1:
						soldier = new KevlarArmor(soldier);
						break;
					case 2:
						soldier = new GrapheneArmor(soldier);
						break;
					case 3:
						soldier = new TankArmor(soldier);
						break;
					case 4:
						soldier = new DragonSlayerSword(soldier);
						break;
					case 5:
						soldier = new PotatoGun(soldier);
						break;
					case 6:
						soldier = new LaserBeam(soldier);
						break;
					case 7:
						soldier = new ChickenWings(soldier);
						break;
					case 8:
						soldier = new GiantFrogLegs(soldier);
						break;
					case 9:
						soldier = new Turbine(soldier);
						break;
					case 10:
						soldier = new IronCheems(soldier);
						break;
					case 0:
						return soldier;
					default:
						System.out.println("Please write a valid option");
						continue;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Please write a valid option");
				continue;
			}
		}
	}

	/* Private methos to display the batallions menu */
	private static void reportBatallions(Soldier c1, Soldier c2, Soldier c3, Soldier s1, Scanner sc, Soldier cheems) {
		while (true) {
			System.out.println("Please choose an option");
			System.out.println("1.- Complete Report");
			System.out.println("2.- Second Batallion Report");
			System.out.println("3.- One Private Soldier Report");
			System.out.println("4.- Cheems Report");
			System.out.println("0.- Quit");
			try {
				String input = sc.nextLine();
				int option = Integer.parseInt(input);
				switch (option) {
					case 1:
						c1.report();
						c2.report();
						c3.report();
						break;
					case 2:
						c2.report();
						break;
					case 3:
						s1.report();
						break;
					case 4:
						System.out.println(cheems.toString());
						break;
					case 0:
						return;
					default:
						System.out.println("Please write a valid option");
						continue;
				}
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Please write a valid option");
				continue;
			}
		}
	}

}
