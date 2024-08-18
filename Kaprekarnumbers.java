import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */
    public static long count(long p)
    {
        long count=0;
        while(p>0)
        {
            p=p/10;
            count++;
        }
        return count;
        
    }
    public static long square(long p)
    {
        return p*p;
    }

    public static void kaprekarNumbers(int p, int q) {
        boolean flag = false;
      
      for(long i = p;i<=q;i++)
      {
          // int len = count(p);
          // int sq = square(p);
          
          // if(i%10!=0)
          // {
          long right = square(i)%(long)Math.pow(10,count(i));
          long left =  square(i)/(long)Math.pow(10,count(i));
          long num = left +right;
            if(num==i)
             {
              
              System.out.print(i+" ");
              flag = true;
             }
         // }
          
      }
          if(!flag)
          {
              System.out.print("INVALID RANGE");
          }

    }

}


public class Kaprekarnumbers {
     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
    
}
