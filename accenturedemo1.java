import java.util.Scanner;
public class accenturedemo1 {

    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int arrsize = sc.nextInt();
      String arr[] = new String[arrsize];
      for(int i =0;i<arrsize;i++)
      {
        arr[i] = sc.next();
      }
      
      String ryhm = sc.next();
      //int len = ryhm.length();
      int num = sc.nextInt();
      String str1 = " ";
      boolean enter = false;
      if(enter == false && ryhm.length()<num)
      {
        System.out.println("No Word");
      }
      else if(ryhm.length()>=num)
      {
      for(int j = num;j>0;j--)
      {
      for(int i = 0;i<arrsize;i++)
      { 
        String substring = " ";
        String ryhm1 =  " ";
        str1 = arr[i];
        int len1 = str1.length();
         substring = str1.substring(len1-j, len1);
         ryhm1 = ryhm.substring(ryhm.length()-j,ryhm.length());
       
        if(ryhm.equals(arr[i]))
        {
            continue;
        }
        
        else if(ryhm1.equals(substring))
        {
            System.out.println(arr[i]);     // printing index
            enter = true;
            break;
        }
        else
        {
            enter = false;
            continue;
        }
    }
      if(enter)
      {
        break;
      }
     
       
     }
    }
    
    
    if(enter == false && ryhm.length()>=num){ 
        System.out.println("No Word");
    }
      // for(String str : arr)
      // {
      //   System.out.print(str+" ");
      // }
      sc.close();
    }
    
}
