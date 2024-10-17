import java.util.Scanner;
public class CinemaBookingBill{
        public static void main(String[] args) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("||                       (===)                                 ||");
            System.out.println("||                     (=======)                               ||");
            System.out.println("||            (=)     (=========)                              ||");
            System.out.println("||           (===)   (===========)                             ||");
            System.out.println("||          (=====)   (=========)                              ||");
            System.out.println("||           (===)     (=======)                               ||");
            System.out.println("||            (=)        (===)                                 ||");
            System.out.println("||           =====================       =                     ||");
            System.out.println("||          =======================    ===                     ||");
            System.out.println("||         ===============================                     ||");
            System.out.println("||         ===============================                     ||");
            System.out.println("||         ===============================                     ||");
            System.out.println("||          =======================    ===                     ||");
            System.out.println("||           =====================       =                     ||");
            System.out.println("||               ===  ===                                      ||");
            System.out.println("||                ==   ==                                      ||");
            System.out.println("||                 =    =                                      ||");
            System.out.println("||    ___   ____________   _____________  ______________       ||");
            System.out.println("||   / - \\/___  __/ __/   /  ___/   _/  /\\// __ /\\   /-\\       ||");
            System.out.println("||  / /\\ /   / / _\\ \\    / /____/ /_      / _/ /\\_/ / __\\      ||");
            System.out.println("|| /_/ \\_\\/_/ /_____/    \\____/____/_/\\_/__/_/  /  /_/  \\\\     ||");
            System.out.println("----------------------------------------------------------------");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the date : ");
            String date = scanner.nextLine();

            System.out.print("Location : ");
            String location = scanner.nextLine();

            System.out.println("\n   -	      _ _      _    _         ___ _ _             ");
            System.out.println("   /_ \\__   ___  _(_) |__ _| |__| |____   |  _( ) |_ __  ___   ");
            System.out.println("  / _  \\ \\/ / _  | | / _  | _ \\ / -_\\  | _|| | | ''\\(_< ) ");
            System.out.println(" /_/ \\_\\ _ /\\_  |_|_\\_ _|_ __/_\\___|  |_| |_|_|_|_|_/__/   ");
            System.out.println("===========================================================   ");

            System.out.println("\n\n1) Movie 1 - Hall 1                        2) Movie 2 - Hall 2");
            System.out.println("3) Movie 3 - Hall 3                        4) Movie 4 - Hall 4");

            System.out.println("Enter the movie number: ");
            int movieChoice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("/n _____                      ");
            System.out.println("  |__ __|_                    ");
            System.out.println("    | | (_)_ _  __   ___      ");
            System.out.println("    | | | |''_ ''_\\/ - \\    ");
            System.out.println("    | | | | | | | | |  _/_    ");
            System.out.println("    |_| |_|_| |_| |_|\\__|    ");
            System.out.println("==============================");

            System.out.println("\n\n1) 9.00 A. M.");
            System.out.println("2) 2.00 P. M.");
            System.out.println("3) 7.00 A. M.");

            System.out.print("Enter time: ");
            String showTime = scanner.nextLine();

            System.out.println("/n _____             _                              ");
            System.out.println("  /  __ \\          | |                             ");
            System.out.println("  | / \\/ _   _  ___| |_  ___  _ _  __   ___ _  __  ");
            System.out.println("  | |   |  | |  / __|  __/ _ \\|  _   _\\/ - \\  __| ");
            System.out.println("  |\\_/\\  |_| \\__\\  || ( ) | | | | | |  __/ |    ");
            System.out.println(" \\___/\\____''_|___/\\_\\___/|_| |_| | |\\__|_|    ");
            System.out.println("====================================================");

            System.out.print("Name : ");
            String name = scanner.nextLine();
            System.out.print("Phone number : ");
            String phone = scanner.nextLine();
            System.out.print("Child or Parent : ");
            String customerType = scanner.nextLine();
            System.out.print("Number of tickets : ");
            int numTickets = scanner.nextInt();

            int pricePerTicket = 90;
            double taxRate = 0.8;
            double amount = numTickets * pricePerTicket;
            double tax = amount * taxRate;
            double total = amount + tax;

            System.out.println("\n\n===============================================================");
            System.out.println("||    ___   ______ _____   ______ _______  _______  ________   ||");
            System.out.println("||   / - \\/_   _//  __/  /  ___//   _/  /\\// __ /\\   /-\\      ||");
            System.out.println("||  / /\\ /  / / _\\ \\   | |___ _/ /_      / _/ /\\_/ / __\\     ||");
            System.out.println("|| /_/ \\_\\/_/ /____/    \\____/____/_/\\_/__/_/  /  /_/  \\\\     ||");
            System.out.println("||                                                                  ||");
            System.out.println("||                                                                  ||");
            System.out.println("|| Date: " + date + "                             Location: " + location +"  ||");
            System.out.println("|| Phone Number: " + phone+"                                          ||");
            System.out.println("|| Tickets: " + numTickets+"                                              ||");
            System.out.println("|| Type: " + customerType+"                                                  ||");
            System.out.println("|| Time: " + showTime+"                                                    ||");
            System.out.println("|| Hall: " + movieChoice+ " Hall                            ||");
            System.out.println(" || Tax: "+tax+"                                                         ||");
            System.out.println(" ||                                                 Total:" + total+"   ||");
            System.out.println("-------------------------------------------------------------------------||");


        }
    }

