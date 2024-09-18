//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //converts to decimal format
        DecimalFormat billFormat = new DecimalFormat("$#,##0.00");

        //obtain bill by user input
        System.out.println("Please enter the bill in dollars and cents: ");
        double bill = scan.nextDouble();
        //obtain tip amount by user input
        System.out.println("What is the tip percentage: ");
        double tip = scan.nextDouble() / 100;
        double totalTip = bill * tip;
        //obtain amount of people by user input
        System.out.println("Number of people: ");
        int totalPeople = scan.nextInt();

        //calculate the amount each person has to pay
        double tipPer = totalTip / totalPeople;
        double totalBill = totalTip + bill;
        double billPer = totalBill / totalPeople;


        //convert bill into dollar and cents form
        int billInt = (int) (billPer);
        double decimal = billPer - billInt;
        int centsInt = (int)((decimal * 100) + 0.50);
        double centConvert = (double) centsInt / 100;
        double lastBillPer = billInt + centConvert;

        //convert tip into dollar and cents form
        int tipInt = (int) (tipPer);
        double decimalTip = tipPer - tipInt;
        int tipCentsInt = (int)((decimalTip * 100) + 0.50);
        double centConvert2 = (double) tipCentsInt / 100;
        double lastTipPer = tipInt + centConvert2;

        //prints out the tip per person and total per person
        System.out.println("Tip per person: " + billFormat.format(lastTipPer));
        System.out.println("Bill per person: " +  billFormat.format(lastBillPer));
        scan.close();


    }
}