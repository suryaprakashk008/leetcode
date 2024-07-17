import java.util.Scanner;
public class zohopattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        for(int i = 0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("  ");
            }
            for(int j =0;j<i;j++)
            {
                if(i%2==0 && j%2==0)
                  System.out.print("* ");
                else if(i%2==0 && j%2!=0)
                  System.out.print("  ");
                else if(i%2!=0 && j%2!=0)
                  System.out.print("  ");
                else
                  System.out.print("* ");
                // System.out.print("* ");
            }
            System.out.println();
        }
           for(int i = n;i>0;i--)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print("  ");
            }
            for(int j =0;j<i;j++)
            {
                // if(i%2==0 && j%2==0)
                //   System.out.print("  ");
                // else if(i%2==1 && j%2!=1)
                //   System.out.print("  ");
                
                // else

                if(i%2==0 && j%2==0)
                  System.out.print("* ");
                else if(i%2==0 && j%2!=0)
                  System.out.print("  ");
                else if(i%2!=0 && j%2!=0)
                  System.out.print("  ");
                else
                  System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    }
    

