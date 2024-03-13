//1.Write a java program to find the sum of the 2nd and 3rd largest numbers in an array.
//int[] values = {10, 51, 53, 39, 47, 44, 21};
import java.util.Arrays;
public class SecondThirdLargestSum {
    public static void main(String[] args) {
        int[] values = {10, 51, 53, 39, 47, 44, 21};
        int sum = findSecondThirdLargestSum(values);
        System.out.println("Sum of the 2nd and 3rd largest numbers: " + sum);
    }

    public static int findSecondThirdLargestSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int secondLargest = arr[n - 2];
        int thirdLargest = arr[n - 3];
        return secondLargest + thirdLargest;
    }
}
