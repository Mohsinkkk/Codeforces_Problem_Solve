import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        
        // Find the maximum roll by Yakko and Wakko
        int maxRoll = Math.max(Y, W);
        
        // Calculate favorable outcomes
        int favorable = 6 - maxRoll + 1;
        
        // Simplify the fraction
        int gcd = gcd(favorable, 6);
        int numerator = favorable / gcd;
        int denominator = 6 / gcd;
        
        // Print the result
        System.out.println(numerator + "/" + denominator);
    }

    // Function to find GCD of two numbers
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
