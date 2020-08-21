package Algorithms;

import java.awt.*;
import java.util.*;
import java.util.List;

public class LC0049_group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        List<String> allSortedString = new ArrayList<>();
        for (String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String aString = String.valueOf(charArray);
            if(allSortedString.contains(aString)){
                System.out.println("contain");
                int position = allSortedString.indexOf(aString);
                ans.get(position).add(str);

            } else {
                allSortedString.add(aString);
                List<String> aList = new ArrayList<>();
                aList.add(str);
                ans.add(aList);
            }
        }

        return ans;
    }

}
