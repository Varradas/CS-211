import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number of rows (1 to 20): ");
        int rows = value.nextInt();

        //Constraint check
        if(rows < 1 || rows > 20){
            System.out.print("Enter the number of rows (1 to 20).");
        }
        else {
            System.out.println("Floyd's Triangle with " + rows + " rows: ");
            for (int i = 1; i < rows; i++){
                for (int j = 1; j <= i; j++){
                    int num = (i+j);
                    System.out.printf("%-4s", num);
                }
                System.out.println();
            }
        }

        value.close();
    }

}