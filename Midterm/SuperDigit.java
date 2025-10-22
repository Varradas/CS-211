import java.util.Scanner;

public class SuperDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (up to 18 digits): ");
        String numberStr = input.nextLine();

        if (!numberStr.matches("\\d+") || numberStr.length() > 18){
            System.out.print("Enter a positive integer up to 18 digits only.");
            return;
        }
        
        long number = Long.parseLong(numberStr);
        int superDigit = findSuperDigit(number);
    }

    public static int findSuperDigit(long num){
        if (num < 1){
            return (int) num;
        }
    }
}
