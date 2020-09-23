package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class LC1347_min_number_steps_make_two_string_anagram {

    public int minSteps(String s, String t) {
        int ans = 0;
        Map<Character,Integer> letterMap = new HashMap<>();

        for( char c : s.toCharArray()){
            if(letterMap.containsKey(c)){
                letterMap.put(c,letterMap.get(c)+1);
            } else {
                letterMap.put(c,1);
            }
        }

        for( char c : t.toCharArray()){
            if(letterMap.containsKey(c)){
                letterMap.put(c,letterMap.get(c)-1);
            } else {
                letterMap.put(c,-1);
            }
        }

        for(int i : letterMap.values()){
            ans += Math.abs(i);
        }

        return ans/2;

    }
}
