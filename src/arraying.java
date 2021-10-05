import java.util.Scanner;

public class arraying {

    //Här är en förändring! :)

    public static Scanner in = new Scanner(System.in);

    public static void mainMenu(){
        boolean runMenu = true;
        while (runMenu){
            try {
        System.out.println("******************************************");
        System.out.println("Welcome to the main menu!");
        System.out.println("\nPlease select one of the options ");
        System.out.println("below...");
        System.out.println("\n1) ");
        System.out.println("2) ");
        System.out.println("3) Exit program");
        System.out.println("******************************************");

        int x = in.nextInt();
                if (x == 1) {
                    System.out.println("Option 1");
                    in.nextLine();
                    in.nextLine();
                } else if (x == 2) {
                    System.out.println("Option 2");
                    in.nextLine();
                    in.nextLine();
                } else if (x == 3) {
                    System.out.println("Exiting program...");
                    runMenu = false;
                } else {
                    System.out.println("Invalid input, please try again!");
                    in.nextLine();
                    in.nextLine();
                }
            }
            catch (Exception e){
                System.out.println("Invalid input, please try again!");
                in.nextLine();
                in.nextLine();
            }
        }
    }




    public static void main(String[] args) {
    mainMenu();
    }
}
