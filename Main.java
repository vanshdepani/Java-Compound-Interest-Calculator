import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the Principle amount: ");
        principle = sc.nextDouble();
        System.out.print("Enter the Interest Rate (in %): ");
        rate = sc.nextDouble() / 100;
        System.out.print("Enter the number of Times Compounded per year: ");
        timesCompounded = sc.nextInt();
        System.out.print("Enter the number of Years: ");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        sc.close();
    }
}