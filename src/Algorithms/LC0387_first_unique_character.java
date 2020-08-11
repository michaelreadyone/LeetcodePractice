package Algorithms;

public class LC0387_first_unique_character {
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++){
            if(repeatFind(s,i)){
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    private boolean repeatFind(String s, int index) {
        for(int i = 0; i < s.length(); i++){
            if(i==index) continue;
            if(s.charAt(index)==s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
