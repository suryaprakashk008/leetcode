import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
              int last_two = year %100;
       // int fd = year/100;
        boolean isleapyear;
        int rem = 0;
        int number=0;
        isleapyear = (year%4==0);
        isleapyear = isleapyear && ((year%100!=0) || (year%400==0));
        switch(month)
        {
            case  1 :
            number = 0;
            break;
            
            case  2 :
            number = 3;
            break;
            
            case  3 :
            number = 3;
            break;
            
            case  4 :
            number = 6;
            break;
            
            case  5 :
            number = 1;
            break;
            
            case  6 :
            number = 4;
            break;
            
            case  7 :
            number = 6;
            break;
            
            case  8 :
            number = 2;
            break;
            
            case  9 :
            number = 5;
            break;
            
            case  10 :
            number = 0;
            break;
            
            case  11 :
            number = 3;
            break;
            
            case  12 :
            number = 5;
            break;
            
        }
        if(year>2000 && year<=2099)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+6+number)-1;
        }
       /* else if(day==13 && month == 02 && year==2010)
        {
            rem = 34;
        }*/
        else
        {
            rem = (last_two +(last_two/4)+day+6+number);   
        }
        }
        else if(year>=2100 && year<=2199)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+4+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+4+number);   
        }
        }
         else if(year>=2200 && year<=2299)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+2+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+2+number);   
        }
        }
         else if(year>=2300 && year<=2399)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+0+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+0+number);   
        }
        }
         else if(year>=2400 && year<=2499)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+6+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+6+number);   
        }
        }
         else if(year>=2500 && year<=2599)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+4+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+4+number);   
        }
        }
         else if(year>=2600 && year<=2699)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+2+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+2+number);   
        }
        }
         else if(year>=2700 && year<=2799)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+0+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+0+number);   
        }
        }
         else if(year>=2800 && year<=2899)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+6+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+6+number);   
        }
        }
         else if(year>=2900 && year<3000)
        {
        if(isleapyear && (month>=1 && month<=2))
        {
            rem = (last_two +(last_two/4)+day+4+number)-1;
        }
        else
        {
            rem = (last_two +(last_two/4)+day+4+number);   
        }
        }
      //  int F=day + ((12*month-1)/5) + ld + (ld/4) +(fd/4)-2*fd;
        //int rem = (F % 7);
       
        
        String t="";
        switch(rem%7)
        {
            case 0:
            t="SUNDAY";
            break;
             
            case 1:
            t = "MONDAY";
            break;
            
            case 2:
             t = "TUESDAY";
            break;
            
            case 3:
            t = "WEDNESDAY";
            break;
            
            case 4:
            t = "THURSDAY";
            break;
            
            case 5:
            t = "FRIDAY";
            break;
            
            case 6:
            t = "SATURDAY";
            break;
        }
        
        
        return t;

    }

}



public class solution1 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        int month = Integer.parseInt(input[0]) ;
        int day = Integer.parseInt(input[1]);
        int year =Integer.parseInt(input[2]) ;

        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }
}
