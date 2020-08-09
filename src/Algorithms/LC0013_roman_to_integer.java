package Algorithms;

public class LC0013_roman_to_integer {
    public int romanToInt(String s) {
        int right = s.length()-1;
        int ans = 0;
        for( int i = right; i >= 0 ; i--){
            if( subtractBefore(s, i) ){
                ans += toInt(s,i-1,i);
                i--;
            } else {
                ans += toInt(s,-1,i);
            }
        }
        return ans;
    }

    private int toInt(String s, int i, int j) {
        if (i < 0) {
            switch (s.charAt(j)) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
            }
        } else {
            switch (s.charAt(j)) {
                case 'V':
                    return 4;
                case 'X':
                    return 9;
                case 'L':
                    return 40;
                case 'C':
                    return 90;
                case 'D':
                    return 400;
                case 'M':
                    return 900;
            }
        }
        return 0;
    }

    private boolean subtractBefore(String s, int i) {
        if(i-1>=0){
            if(s.substring(i-1,i+1).equals("IX") || s.substring(i-1,i+1).equals("IV") || s.substring(i-1,i+1).equals("XL") ||
                    s.substring(i-1,i+1).equals("XC") || s.substring(i-1,i+1).equals("CD") || s.substring(i-1,i+1).equals("CM")){
                return true;
            }
        }
        return false;
    }
}
