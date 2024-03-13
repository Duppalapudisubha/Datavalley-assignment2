//2.Write a java program to swap two numbers without using a third variable and (+ and -) operators?
	int a = 200, b = 300;
public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 200, b = 300;
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
