import java.util.Scanner;

public class BMIQuestion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("weight: ");
        float weight = scanner.nextFloat();

        System.out.println("height: ");
        float height = scanner.nextFloat();

        float BMI = weight/(height*height);

        System.out.println("your BMI for "+"weight ="+weight+"KG heigth = "+height +"meters is:"+BMI+" bmi");
        scanner.close();

    }
    
}
