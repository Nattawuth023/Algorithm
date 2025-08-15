import java.util.Scanner;

public class calsuis {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("fahrenheit");
        double fahrenheit = scanner.nextDouble();

        double calsuis = (0.5/0.9)*(fahrenheit-32);

        System.out.println("calsuis: "+calsuis);
        scanner.close();
    }
    
}
