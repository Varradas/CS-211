import java.util.Scanner;

public class PartyCone {
    public static void printSurfaceArea(double h, double r){
        double maffs = (float) Math.sqrt(h*h + r*r);
        double piVal = Math.PI;

        double result = (piVal*r)*(r + maffs);
        System.out.printf("Surface Area is %.4f\n" , result);
    }
    public static void printVolume(double h, double r){
        double piVal = Math.PI;

        double result = (piVal*(r*r))*(h/3);
        System.out.printf("Volume is %.4f\n" , result);
    }

    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\nDiameter of the cone's base: ");
            double base = input.nextDouble();
            System.out.print("Height of the cone: ");
            double height = input.nextDouble();
            double radius = base/2;

            printSurfaceArea(height, radius);
            printVolume(height, radius);
        }
    }
}
