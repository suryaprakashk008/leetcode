import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class happynumber {

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
            System.out.println(seen);
        }
       
        return n == 1;
    }

    private static int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
       
        
        if (isHappy(number)) {
            System.out.println(number + " is a happy number!");
        } else {
            System.out.println(number + " is not a happy number.");
        }
        
        scanner.close();
    }
}
