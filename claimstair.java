import java.util.Scanner;
public class claimstair {

    public static int fib(int n)
    {
       if(n<=1)
       {
        return 1;
       }
       // return fib(n-1)+fib(n-2);
       int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int result = fib(n);
      System.out.println(result);
   }
}


// class Solution {
//     public int climbStairs(int n) {
        
//        if(n<=1)
//        {
//         return 1;
//        }
//         int a =1, b=1;
//         for(int i =2;i<=n;i++)
//         {
//             int temp = a+b;
//             a=b;
//             b=temp;
//         }
//         return b;
//     }
// }
