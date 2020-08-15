package Algorithms;

public class LC0038_count_and_say {
    public String countAndSay(int n) {
        // base case
        if(n==1) return "1";
        // recursive case
        return countSay(countAndSay(n-1));
    }

    private String countSay(String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++){
            int count = 1;
            char now = a.charAt(i);
            while(i+1 < a .length() && a.charAt(i)==a.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(now);
        }
        return sb.toString();
    }
}
