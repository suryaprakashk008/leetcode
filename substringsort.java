import java.util.Scanner;
public class substringsort {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        int len = str.length();
        int size = len-k+1;
        String[] arr = new String[size];
        for(int i =0;i<size;i++)
        {
              arr[i] = (str.substring(i,i+k));
        }
        boolean swapped;
        for(int i =0;i<arr.length-1;i++)
        {    
            swapped = false;
            for(int j = 0;j<arr.length-1-i;j++)
            {

             if(arr[j].compareTo(arr[j+1])>0)
             {
                String temp= arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;

             }
           

        }
        if (!swapped) {
            break;
                   }
        }
        for(String num : arr)
        {
             System.out.print(num+" ");
        }
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    
    }
}

