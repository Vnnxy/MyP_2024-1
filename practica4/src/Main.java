import java.util.Scanner;

/**
 * Class for the Main class.
 * 
 * @author equipo.
 */
public class Main {

    /**
     * The main method
     * 
     * @param args The arguments it receives
     */
    public static void main(String[] args) {
        StarForge customShip;
        Scanner sc = new Scanner(System.in);
        double budget;
        while (true) {
            System.out.println("Please enter your budget, we only accept Imperial credits: ");
            try {
                budget = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("please write a number");
                continue;
            }
        }
        while (true) {
            customShip = new CustomShip();
            chooseParts(sc, customShip);
            SpaceShip spaceShip = customShip.getSpaceShip();
            System.out.println(spaceShip.toString());
            if (spaceShip.getCredit() <= budget) {
                System.out.println(
                        String.format("What a great ship!!. Please pay the %.2f to my droid", spaceShip.getCredit()));
                System.out.println("This is your ship.");
                System.out.println(spaceShip.toString());
                return;
            } else {
                System.out.println("Oh no. It looks like you went over your budget.");
                System.out.println("Please choose an option:");
                System.out.println("1.- Create a new ship");
                System.out.println("2.- Look at our catalogue");
                while (true) {
                    try {
                        int input = Integer.parseInt(sc.nextLine());
                        switch (input) {
                            case 1:
                                break;
                            case 2:
                                spaceShip = seeCatalogue(sc).getSpaceShip();
                                System.out.println("Your selected ship: ");
                                System.out.println(spaceShip.toString());
                                if (spaceShip.getCredit() < budget) {
                                    System.out.println(String.format(
                                            "What a great ship!!. Please pay the %.2f credits to my droid",
                                            spaceShip.getCredit()));
                                    return;
                                } else {
                                    System.out.println("Please don't come here if you are broke!");
				    System.out.println("Press enter to end: ");
				    String s = sc.nextLine();
                                    return;
                                }
                            default:
                                System.out.println("Please write a valid option");
                                continue;
                        }
                    } catch (NumberFormatException nfe) {
                        System.out.println("Please write a valid option");
                        continue;
                    }
                    break;
                }
            }
        }
    }

    /**
     * 
     * @param sc         The scanner we will be using
     * @param customShip The builder we will create
     */
    private static void chooseParts(Scanner sc, StarForge customShip) {
        while (true) {
            System.out.println("Please choose an Engine:");
            System.out.println("1.- InterContinental ");
            System.out.println("2.- InterPlanetary  ");
            System.out.println("3.- InterGalactic ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        Components interContinental = new InterContinental();
                        customShip.addJetEngine(interContinental);
                        break;
                    case 2:
                        Components interPlanetary = new InterPlanetary();
                        customShip.addJetEngine(interPlanetary);
                        break;
                    case 3:
                        Components interGalactic = new InterGalactic();
                        customShip.addJetEngine(interGalactic);
                        break;
                    default:
                        System.out.println("Please write a valid option");
                        continue;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("Please choose an Armor:");
            System.out.println("1.- Simple ");
            System.out.println("2.- Reinforced  ");
            System.out.println("3.- Fortress ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        Components simpleArmor = new Simple();
                        customShip.addArmor(simpleArmor);
                        break;
                    case 2:
                        Components reinforced = new Reinforced();
                        customShip.addArmor(reinforced);
                        break;
                    case 3:
                        Components fortress = new Fortress();
                        customShip.addArmor(fortress);
                        break;
                    default:
                        System.out.println("Please write a valid option");
                        continue;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("Please choose a Weapon:");
            System.out.println("1.- Simple Laser ");
            System.out.println("2.- Plasma Blaster  ");
            System.out.println("3.- Planet Destroyer ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        Components simpleLaser = new SimpleLaser();
                        customShip.addWeapon(simpleLaser);
                        break;
                    case 2:
                        Components plasmaBlaster = new PlasmaBlaster();
                        customShip.addWeapon(plasmaBlaster);
                        break;
                    case 3:
                        Components planetDestroyer = new PlanetDestroyer();
                        customShip.addWeapon(planetDestroyer);
                        break;
                    default:
                        System.out.println("Please write a valid option");
                        continue;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("Please choose a Cabin:");
            System.out.println("1.- Individual ");
            System.out.println("2.- Small Crew ");
            System.out.println("3.- Army ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        Components individual = new Individual();
                        customShip.addCabin(individual);
                        break;
                    case 2:
                        Components smallCrew = new SmallCrew();
                        customShip.addCabin(smallCrew);
                        break;
                    case 3:
                        Components army = new Army();
                        customShip.addCabin(army);
                        break;
                    default:
                        System.out.println("Please write a valid option");
                        continue;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }
            break;
        }
    }

    /**
     * Displays the catalogue
     * 
     * @param sc The scanner
     * @return returns a star forge
     */
    private static StarForge seeCatalogue(Scanner sc) {
        while (true) {
            System.out.println("Welcome to our catalogue! ");
            System.out.println("1.- Tie Fighter ");
            System.out.println("2.- Imperial Shuttle ");
            System.out.println("3.- Death Star ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        return new TieFighter();
                    case 2:
                        return new ImperialShuttle();
                    case 3:
                        return new DeathStar();
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
}
