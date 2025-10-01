import java.util.Arrays;
import java.util.Scanner;

public class CheckSequence {
    public static int[] checkSequence(int[] arr){
        if (arr == null || arr.length < 2) {
            return new int[]{0, -1};
        }
    
        boolean isArithmetic = true;
        int arithmeticDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != arithmeticDiff) {
                isArithmetic = false;
                break;
            }
        }
    
        if (isArithmetic) {
            return new int[]{1, 0};
        }
    
        boolean isGeometric = true;
        if (arr[0] == 0) {
            isGeometric = false;
        } else {
            int geometricRatio = arr[1] / arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] == 0 || arr[i] / arr[i-1] != geometricRatio) {
                    isGeometric = false;
                    break;
                }
            }
        }
        
        if (isGeometric) {
            return new int[]{1, 1};
        }
        
        return new int[]{0, -1};
    }
    
    public static void printElement(int[] arr, int n, int type){
        int result = arr[0];
        
        if (type == 0){
            int difference = arr[1] - arr[0];
            result = arr[0] + (n - 1) * difference;
        }
        else if (type == 1){
            int ratio = arr[1] / arr[0];
            result = arr[0] * (int)Math.pow(ratio, n - 1);
        }
        System.out.print("Element " + n + " is " + result);
    }
    
    public static void main(String args[]){
        String x;
        int element;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the first 5 elements of the sequence: ");
            x = input.nextLine();
            int[] intArr = Arrays.stream(x.split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
            
            int[] sequenceResult = checkSequence(intArr);
            boolean hasSequence = (sequenceResult[0] == 1);
            int sequenceType = sequenceResult[1];
            
            if (hasSequence){
                System.out.print("Find which element: ");
                element = input.nextInt();
                printElement(intArr, element, sequenceType);
            } else {
                System.out.print("The sequence is neither arithmetic nor geometric.\n");
            }
        }
    }
}
