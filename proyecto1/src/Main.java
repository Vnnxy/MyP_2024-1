import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        VeryRealServer server = new VeryRealServer();
        Client client;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to our great shop!\n Please enter your credentials:");
            String username = "";
            String password = "";
            System.out.println("Username:");
            username = sc.nextLine();
            System.out.println("Password:");
            password = sc.nextLine();
            ProxyUser user = server.getUser(username);
            if (user == null) {
                System.out.println("Username not found. Please use a real username.");
                continue;
            }
            if (!user.getPassword().equals(password)) {
                System.out.println("Incorrect Password. Please try again.");
                continue;
            }
            String country = user.getCountry();
            client = getLanguage(country);
            System.out.println("Login Successful. Customazing the shop for a better experience...");
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(".");
                TimeUnit.SECONDS.sleep(1);
                System.out.println(".");
            } catch (InterruptedException ie) {
            }

            System.out.println(client.welcome());
            if (user.hasDeal())
                System.out.println(client.deal());
            while (true) {
                System.out.println(client.menuOptions());
                try {
                    int option = Integer.parseInt(sc.nextLine());
                    switch (option) {
                        case 0:
                            System.exit(0);
                        case 1:
                            client.showCatalogue(server.getCatalogue());
                            continue;
                        case 2:
                            buyMenu(client, server, sc, user);
                            continue;
                        case 3:
                            break;
                    }
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.println(client.validOption());
                    continue;
                }
            }
        }

    }

    private static Client getLanguage(String country) {
        switch (country) {
            case "Spain":
                return new Client(new Spanish());
            case "USA":
                return new Client(new English());
            case "Mexico":
                return new Client(new Latin());
            default:
                return null;

        }

    }

    private static String getDeliveryDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.now().toEpochDay();
        int maxDay = (int) LocalDate.of(2100, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDeliveryDate = LocalDate.ofEpochDay(randomDay);

        return randomDeliveryDate.toString();

    }

    private static void buyMenu(Client client, VeryRealServer server, Scanner sc, ProxyUser proxy) {
        while (true) {
            client.showCatalogue(server.getCatalogue());
            System.out.println(client.addToCart());
            System.out.println("Balance: " + proxy.getBalance());
            System.out.println(client.cart() + "\n" + proxy.getShoppingCart());
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1:
                        break;
                    case 2:
                        if (proxy.isEmpty()) {
                            System.out.println(client.empty());
                            break;
                        }
                        if (!proxy.hasEnoughMoney()) {
                            System.out.println(client.notEnoughMoney());
                            proxy.reset();
                            break;
                        }
                        System.out.println(client.safeSell());
                        try {
                            int account = Integer.parseInt(sc.nextLine());
                            if (proxy.getAccount() != (account)) {
                                System.out.println(client.falseAccount());
                                System.exit(0);
                            }
                            proxy.pay();
                            try {
                                System.out.println(client.bank());
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println(".");
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println(".");
                                TimeUnit.SECONDS.sleep(1);
                                System.out.println(".");
                                System.out.println(client.thanks());
                            } catch (InterruptedException ie) {
                            }

                            System.out.println(client.ticket());
                            System.out.println(proxy.getShoppingCart());
                            System.out.println("\tOFF: " + proxy.getDiscount());
                            System.out.println(client.deliverDate());
                            System.out.println(getDeliveryDate());
                            proxy.reset();
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.println(client.falseAccount());
                            System.exit(0);
                        }

                    default:
                        Product product = server.getProduct(option);
                        if (product == null) {
                            System.out.println(client.validOption());
                            continue;
                        }
                        proxy.addProduct(product);
                        continue;
                }
                break;
            } catch (NumberFormatException nfe) {
                System.out.println(client.validOption());
                continue;
            }
        }
    }

}
