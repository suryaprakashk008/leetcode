import java.util.Scanner;
public class ReverseInteger {
    
    public  static int reverse(int x) {
        int sum = 0;
        int num = 0;
         int Minvalue = Integer.MAX_VALUE;
         int Maxvalue = Integer.MIN_VALUE;
        while(x!=0)
        {
           if(sum<Maxvalue/10 || sum>Minvalue/10) return 0;
          num = x%10;
          sum = sum*10 + num;
          x = x/10;
        }
       
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println(result);
        sc.close();
    }

}
