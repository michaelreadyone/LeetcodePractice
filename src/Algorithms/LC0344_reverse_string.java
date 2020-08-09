package Algorithms;

//Input: ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]

/**
 * corner case: empty string, one element array
 */

public class LC0344_reverse_string {
    public void reverseString(char[] s) {
        char tmp;
        for(int i = 0; i < s.length/2 ; i++){
            tmp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = tmp;
        }
    }
}
