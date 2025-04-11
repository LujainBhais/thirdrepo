/*Monetary Units :
Lujain Bhais */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price in dollar : ");
        double amount = input.nextFloat();
        //لتحويل المبلغ الى سنتات  :
        int totalCents=(int)Math.round(amount*100);
        //ايجاد الدولار :
        int dollar=totalCents/100;
        totalCents%=100;
        //ايجاد ال quarters:
        int quarters=totalCents/25;
        totalCents%=25;
        //ايجادي ال dimes :
        int dimes=totalCents/10;
        totalCents%=10;
        //حساب ال nickels :
        int nickels=totalCents/5;
        totalCents%=5;
        //حساب ال pennies :
        int pennies=totalCents;

        //الطباعة :
        System.out.print("Dollar : "+dollar);
        System.out.print("\nQuarter : "+quarters);
        System.out.print("\nDimes : "+dimes);
        System.out.print("\nNickels : "+nickels);
        System.out.print("\nPennies : "+pennies);
        System.out.print("Lujain's Project");

    }
}
