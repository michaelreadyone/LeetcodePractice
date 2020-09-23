package test;

import java.util.*;

public class test {
    public int calculate(String s) {
        s.replaceAll(" ","");
        int ans = Integer.parseInt(String.valueOf(s.charAt(0)));
        char calcu = s.charAt(1);
        for(int i = 2; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).matches("[0-9]")){
                ans = naiveCalc(ans,calcu,s.charAt(i));
            } else {
                calcu = s.charAt(i);
            }
        }
        return ans;
    }

    private int naiveCalc(int ans, char calcu, char ch) {
        switch (calcu){
            case '+':
                ans += Integer.parseInt(String.valueOf(ch));
                break;
            case '-':
                ans -= Integer.parseInt(String.valueOf(ch));
                break;

        }
        return ans;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] x = {1,2,3,4};
        System.out.println(x[0]);
    }

}
