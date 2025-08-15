import java.util.Scanner;

public class BodySurfaceArea {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("width");
        float width = scanner.nextFloat();

        System.out.println("length");
        float length = scanner.nextFloat();

        float body = (length*width)/360;

        System.out.println("width :"+width+"length: "+length+"body surface area is:"+body);
        scanner.close();


    }
    
}
