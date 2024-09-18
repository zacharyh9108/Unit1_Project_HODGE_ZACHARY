import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("|----------------------------------------|");
        System.out.println("|        Do not type in symbols!         |");
        System.out.println("|----------------------------------------|");
        System.out.println();
        System.out.println("------------------------------");
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
        double amountOfTip = Math.round((bill * tip / 100) * 100.0) / 100.0;
        double tipPerPpl = Math.round((amountOfTip / ppl) * 100.0) / 100.0;
        double totalBill = Math.round((bill + amountOfTip) * 100.0) / 100.0;
        double totalPerPpl = Math.round((totalBill / ppl) * 100.0) / 100.0;
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