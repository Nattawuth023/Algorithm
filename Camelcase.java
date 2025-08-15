import java.util.Scanner;

public class Camelcase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price of one dress: ");
        double price = scanner.nextDouble();

        System.out.print("Enter numder of dresses to buy: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter discount rate: ");
        double discount = scanner.nextDouble();

        double cost = (price* amount);

        double discountAmont = (price*discount)/100;

        double pay = cost - discountAmont;

        System.out.println("Total cost = "+ cost +" baht");
        System.out.println("discountAmount = "+ discountAmont +" baht");
        System.out.println("Net Pay = "+ pay +" baht");
        scanner.close();
    }
    
}
