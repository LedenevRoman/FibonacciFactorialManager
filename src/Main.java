import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter task number: ");
        System.out.println("1 - count Fibonacci sequence of number; 2 - calculate Factorial of number.");
        int taskNumber = in.nextInt();
        System.out.println("Enter cycle number: ");
        System.out.println("1 - use cycle while; 2 - use cycle do-while; 3 - use cycle for");
        int cycleNumber = in.nextInt();
        System.out.println("Enter number to calculate: ");
        int number = in.nextInt();
        AlgoritmManager result = new AlgoritmManager();
        System.out.println(Arrays.toString(result.getResult(taskNumber, cycleNumber, number)));
    }
}