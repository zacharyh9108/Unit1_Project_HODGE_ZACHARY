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
        double amountOfTip = (bill * tip / 100);
        double roundAmountOfTip = Math.round((amountOfTip * 100) / 100);
        double tipPerPpl = amountOfTip / ppl;
        double totalBill = bill + amountOfTip;
        double totalPerPpl = totalBill / ppl;
        System.out.println("------------------------------");
        System.out.println();
        System.out.println(roundAmountOfTip);
        System.out.println(amountOfTip);
    }
}