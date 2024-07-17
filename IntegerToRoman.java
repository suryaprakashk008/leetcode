public class IntegerToRoman {
    public String intToRoman(int num) {
        int unit;
        int ten;
        int hunder;
        int thosand;
        unit = num%10;
        num = num/10;
        ten = num%10;
        num = num/10;
        hunder = num%10;
        num= num/10;
        thosand = num%10;
        String t="";
        String h="";
        String te="";
        String u="";
        String roman = "";
        switch(unit)
        {
            case 1:
            u = "I";
            break;
            case 2:
            u = "II";
            break;
            case 3:
            u ="III";
            break;
            case 4:
            u ="IV";
            break;
            case 5:
            u= "V";
            break;
            case 6:
            u= "VI";
            break;
            case 7:
            u="VII";
            break;
            case 8:
            u="VIII";
            break;
            case 9:
            u="IX";
            break;
        }
        switch(ten)
        {
            case 1:
            te = "X";
            break;
            case 2:
            te = "XX";
            break;
            case 3:
            te ="XXX";
            break;
            case 4:
            te ="XL";
            break;
            case 5:
            te= "L";
            break;
            case 6:
            te= "LX";
            break;
            case 7:
            te="LXX";
            break;
            case 8:
            te="LXXX";
            break;
            case 9:
            te="XC";
            break;
        }
        switch(hunder)
        {
            case 1:
            h = "C";
            break;
            case 2:
            h = "CC";
            break;
            case 3:
            h ="CCC";
            break;
            case 4:
            h ="CD";
            break;
            case 5:
            h= "D";
            break;
            case 6:
            h= "DC";
            break;
            case 7:
            h="DCC";
            break;
            case 8:
            h="DCCC";
            break;
            case 9:
            h="CM";
            break;
        }
        switch(thosand)
        {
            case 1:
            t = "M";
            break;
            case 2:
            t = "MM";
            break;
            case 3:
            t ="MMM";
            break;
            // case 4:
            // t ="CD";
            // break;
            // case 5:
            // t= "D";
            // break;
            // case 6:
            // t= "DC";
            // break;
            // case 7:
            // t="DCC";
            // break;
            // case 8:
            // t="DCCC";
            // break;
            // case 9:
            // t="CM";
            // break;
        }
        roman=(t+""+h+""+te+""+u);

        return roman;
    }
}
