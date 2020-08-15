package Algorithms;

public class LC0387_first_unique_character {
    /**
     * Given a string, find the first non-repeating character in it and return its index.
     * If it doesn't exist, return -1.
     */
    public int firstUniqChar(String s) {
        // loop through each position, return the position of first unique char
        for(int i = 0; i < s.length(); i++){
            // Check whether the char on position i in a string is repeatable
            if(repeatFind(s,i)){
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    /**
     * Check whether the char on position index in a string is repeatable
     *
     * @param s String to be checked
     * @param index Char position
     * @return ture if the char is not unique, return false otherwise
     */
    private boolean repeatFind(String s, int index) {
        for(int i = 0; i < s.length(); i++){
            if(i==index) continue;//skip the comparison to itself
            if(s.charAt(index)==s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
