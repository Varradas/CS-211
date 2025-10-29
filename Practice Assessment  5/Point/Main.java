package Point;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){
            System.out.print("Enter x: ");
            int x = input.nextInt();
            System.out.print("Enter y: ");
            int y = input.nextInt();

            Point point = new Point(x,y);

            point.setX(x);
            point.setY(y);

            point.printcoordinates(x, y);
            point.calculateDistance(x, y);
        }
    }
}
