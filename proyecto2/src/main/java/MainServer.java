import java.util.Scanner;

public class MainServer {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        hostOptions(sc);
    }

    public static void hostOptions(Scanner sc) throws Exception {
        System.out.println("Enter port:");
        String port = sc.nextLine();
        HostServer host = null;
        try {
            host = new HostServer(port);
        } catch (Exception e) {
            return;
        }
        host.host();
    }
}
