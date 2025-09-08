import java.util.*;
public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("take a user input ");
        int n = sc.nextInt();
        System.out.println("Number of digits: " + countDigit(n));
        sc.close();
    }

    public static int countDigit(int n) {
        if (n == 0) return 1;   // special case for 0
        n = Math.abs(n);        // handle negatives
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}

