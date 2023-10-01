import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CustomShip customShip = new CustomShip();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your budget:");
        Double budget = Double.parseDouble(sc.nextLine());

        while (true) {
            chooseParts(sc, customShip);
            SpaceShip spaceShip = customShip.getSpaceShip();
            if (spaceShip.getCredit() < budget) {
                System.out.println("What a great ship!!. Please pay the " + spaceShip.getCredit() + " at the machine");
                System.out.println(spaceShip.toString());
            } else {
                System.out.println("Oh no. It looks like you went over your budget.");
                System.out.println("Please choose an option:");
                System.out.println("1.- Create a new ship");
                System.out.println("2.- Look at our catalogue");
                try {
                    int input = Integer.parseInt(sc.nextLine());
                    switch (input) {
                        case 1:
                            chooseParts(sc, customShip);
                            break;
                        case 2:
                            spaceShip = seeCatalogue(sc).getSpaceShip();
                            break;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Please write a valid option");
                    continue;
                }
                if (spaceShip.getCredit() < budget) {
                    System.out.println(
                            "What a great ship!!. Please pay the " + spaceShip.getCredit() + " at the machine");
                    System.out.println(spaceShip.toString());
                } else {
                    System.out.println("Please don't come here if you are broke!");
                    System.exit(1);
                }

            }
        }

    }

    private static void chooseParts(Scanner sc, CustomShip customShip) {
        while (true) {
            System.out.println("Please choose an Engine:");
            System.out.println("1.- InterContinental ");
            System.out.println("2.- InterPlanetary  ");
            System.out.println("3.- InterGalactic ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        InterContinental interContinental = new InterContinental();
                        customShip.addJetEngine(interContinental);
                        break;
                    case 2:
                        InterPlanetary interPlanetary = new InterPlanetary();
                        customShip.addJetEngine(interPlanetary);
                        break;
                    case 3:
                        InterGalactic interGalactic = new InterGalactic();
                        customShip.addJetEngine(interGalactic);
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }

            System.out.println("Please choose an Armor:");
            System.out.println("1.- Simple ");
            System.out.println("2.- Reinforced  ");
            System.out.println("3.- Fortress ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        Simple simpleArmor = new Simple();
                        customShip.addArmor(simpleArmor);
                        break;
                    case 2:
                        Reinforced reinforced = new Reinforced();
                        customShip.addArmor(reinforced);
                        break;
                    case 3:
                        Fortress fortress = new Fortress();
                        customShip.addArmor(fortress);
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }

            System.out.println("Please choose a Weapon:");
            System.out.println("1.- Simple Laser ");
            System.out.println("2.- Plasma Blaster  ");
            System.out.println("3.- Planet Destroyer ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        SimpleLaser simpleLaser = new SimpleLaser();
                        customShip.addWeapon(simpleLaser);
                        break;
                    case 2:
                        PlasmaBlaster plasmaBlaster = new PlasmaBlaster();
                        customShip.addWeapon(plasmaBlaster);
                        break;
                    case 3:
                        PlanetDestroyer planetDestroyer = new PlanetDestroyer();
                        customShip.addWeapon(planetDestroyer);
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }

            System.out.println("Please choose a Cabin:");
            System.out.println("1.- Individual ");
            System.out.println("2.- Small Crew ");
            System.out.println("3.- Army ");
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        Individual individual = new Individual();
                        customShip.addCabin(individual);
                        break;
                    case 2:
                        SmallCrew smallCrew = new SmallCrew();
                        customShip.addCabin(smallCrew);
                        break;
                    case 3:
                        Army army = new Army();
                        customShip.addCabin(army);
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }
        }
    }

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
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Please write a valid option");
                continue;
            }
        }
    }
}
