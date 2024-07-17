import java.util.Scanner;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n != 1 && n % 2 == 1) {
            return false;
        }
        while(n > 1) {
            if(n % 2 == 1) return false;
            n = n / 2;
        }
        return n == 1;
    }
    public static void main(String[] args)
    {   Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        boolean result = isPowerOfTwo(Integer.parseInt(args[0]));
       System.out.println(result);
    }
    
}
