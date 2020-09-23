package Algorithms;

import java.util.Arrays;

public class LC0242_valid_anagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] carray = new int[26];
        for(char c : s.toCharArray()){
            carray[c-'a']++;
        }
        System.out.println(carray.toString());
        Arrays.toString(carray);
        for(char c : t.toCharArray()){
            carray[c-'a']--;
        }

        for(int i : carray){
            if(i!=0){
                return false;
            }
        }

        return true;

    }
}
