import java.util.Scanner;

class PemesananTiker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket kereta api");
        System.out.println("Please choose a route:");
        System.out.println("1. Cikampek - Tuparev | business: 20.000 | Excutive: 30.000");
        System.out.println("2. Johar - Bypass  | business: 10.000 | Excutive: 20.000");
        System.out.println("3. Klari - badami  | business: 15.000 | Excutive: 25.000");
        System.out.print("Your choice: ");
        int routeChoice = scanner.nextInt();

        System.out.println("Please choose a class:");
        System.out.println("1. Business ");
        System.out.println("2. Executive ");
        System.out.print("Your choice: ");
        int classChoice = scanner.nextInt();

        int price;
        if (routeChoice == 1) {
            if (classChoice == 1) {
                price = 20000;
            } else {
                price = 30000;
            }
        } else if (routeChoice == 2) {
            if (classChoice == 1) {
                price = 10000;
            } else {
                price = 15000;
            }
        } else {
            if (classChoice == 1) {
                price = 15000;
            } else {
                price = 25000;
            }
        }

        System.out.print("Enter the number of tickets: ");
        int quantity = scanner.nextInt();

        int totalPrice = price * quantity;

        System.out.println("Your total price is Rp. " + totalPrice + ",-");
        System.out.println("Route: "
                + (routeChoice == 1 ? "Cikampek - Tuparev" : routeChoice == 2 ? "Johar - Bypass" : "Klari - badami"));
        System.out.println("Class: " + (classChoice == 1 ? "Business" : "Executive"));
        System.out.println("Price per ticket: Rp. " + price + ",-");

        System.out.println("Thank you for using our Train Ticket Reservation System!");
    }
}