import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("|----------------------------------------|");
        System.out.println("|        Do not type in symbols!         |");
        System.out.println("|----------------------------------------|");
        System.out.println();
        System.out.println("------------------------------");

        //Gathering user inputs for calculations
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your bill($): ");
        String userBill = s.nextLine();
        double bill = Double.parseDouble(userBill);

        Scanner x = new Scanner(System.in);
        System.out.print("Please enter your tip percent: ");
        String userTip = x.nextLine();
        double tip = Double.parseDouble(userTip);

        Scanner y = new Scanner(System.in);
        System.out.print("Please enter the amount of people: ");
        String userPpl = y.nextLine();
        int ppl = Integer.parseInt(userPpl);

        //Calculating user inputs inside a variable to not clutter the display statements
        double amountOfTip = Math.round((bill * tip / 100) * 100.00) / 100.00;
        double tipPerPpl = Math.round((amountOfTip / ppl) * 100.00) / 100.00;
        double totalBill = Math.round((bill + amountOfTip) * 100.00) / 100.00;
        double totalPerPpl = Math.round((totalBill / ppl) * 100.00) / 100.00;

        //Displaying the calculations
        System.out.println("------------------------------");
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Total tip amount: $" + amountOfTip);
        System.out.println("Total bill cost: $" + totalBill);
        System.out.println("Tip per person: $" + tipPerPpl);
        System.out.println("Total bill per person: $" + totalPerPpl);
        System.out.println("------------------------------");
    }
}