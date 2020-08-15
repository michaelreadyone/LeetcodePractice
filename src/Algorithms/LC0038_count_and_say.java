package Algorithms;

public class LC0038_count_and_say {
    public String countAndSay(int n) {
        // base case
        if(n==1){
            return "1";
        }

        String a = countAndSay(n-1);

        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++){
            char now = a.charAt(i);
            while(i+1 < a .length() && a.charAt(i)==a.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(now);
            count=1;
        }
        String newString = sb.toString();

    }
}
