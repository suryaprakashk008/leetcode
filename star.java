import java.util.Scanner;
public class star {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        // int l=0;
        // //int l=0;
        // for(int i =-n;i<=n;i++)
        // {
        //     if(i<0){
        //         l=-i;
        //     }
        //     else{
        //         l=i;
        //     }
        //     for(int x =0;x<n-l-1;x++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=0;k<l+1;k++){
        //         System.err.print("* ");
        //     }
        //     System.out.println();
        // }
             
        for(int i = 0;i<n;i++)
        {
            for(int j = 0 ;j<=i;j++)
            {
                if(i%2!=0 && j%2==0)
                  System.out.print("  ");
                else if(i%2==0 && j%2!=0)
                  System.out.print("  ");
                else
                  System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1;i>0;i--)
        {
            for(int j = i ;j>0;j--)
            {
                if(i%2==0 && j%2==0)
                  System.out.print("  ");
                else if(i%2==1 && j%2!=1)
                  System.out.print("  ");
                
                else
                  System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}
//OUTPUT
// 5
// * 
//   * 
// *   * 
//   *   * 
// *   *   * 
//   *   *   * 
// *   *   * 
//   *   * 
// *   * 
//   * 
// * 
