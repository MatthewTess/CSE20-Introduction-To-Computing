import java.util.Scanner;

public class Bobcar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard.");
        System.out.print("Please choose the rental car: ");
        int car = input.nextInt();

        int Economy;
        int Compact;
        int Standard;
        Economy = 35;
        Compact = 45;
        Standard = 95;

        System.out.println("Please enter the number of rental days: ");
        int days = input.nextInt();

        System.out.println("Club member? Enter 1 for yes, 0 for no: ");
        int clubMember = input.nextInt();

        if (clubMember == 0 && car == 1) {
            System.out.println("Base: " + days + " days for an Economy @ $35 per day: $" + Economy * days);
            System.out.println("Total Estimate for Rental: $" + Economy * days / 1);
        } else if (clubMember == 0 && car == 2) {
            System.out.println("Base: " + days + " days for a Compact @ $45 per day: $" + Compact * days / 1);
            System.out.println("Total Estimate for Rental: $" + Compact * days);
        } else if (clubMember == 0 && car == 3) {
            System.out.println("Base: " + days + " days for a Standard @ $95 per day: $" + Standard * days / 1);
            System.out.println("Total Estimate for Rental: $" + Standard * days / 1);
        }

        if (clubMember == 1) {
            System.out.println("Platinum Executive Package? Enter 1 for yes, 0 for no.");
            int platinum = input.nextInt();

            int discount;
            int n1, n2, n3;
            discount = days / 7;
            n1 = (int) Economy * days;
            n2 = (int) Compact * days;
            n3 = (int) Standard * days;

            if (car == 1) {
                System.out.println("Base: " + days + " days for an Economy @ $35 per day: $" + Economy * days);
                System.out.println("Club Member discount: -$" + (discount * Economy));
            } else if (car == 2) {
                System.out.println("Base: " + days + " days for a Compact @ $45 per day: $" + Compact * days);
                System.out.println("Club Member discount: -$" + (discount * Compact));
            } else if (car == 3) {
                System.out.println("Base: " + days + " days for a Standard @ $95 per day: $" + Standard * days);
                System.out.println("Club Member discount: -$" + (discount * Standard));
            }

            if (platinum == 0 && car == 1) {
                System.out.println("Total Estimate for Rental: $" + (Economy * days - (discount * Economy)));
            } else if (platinum == 0 && car == 2) {
                System.out.println("Total Estimate for Rental: $" + (Compact * days - (discount * Compact)));
            } else if (platinum == 0 && car == 3) {
                System.out.println("Total Estimate for Rental: $" + (Standard * days - (discount * Standard)));
            }

            if (platinum == 1 && car == 1) {
                System.out.println("Platinum Executive
