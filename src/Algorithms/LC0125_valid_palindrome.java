class LC0125_valid_palindrome {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;

        String slow = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : slow.toCharArray()){
            if(String.valueOf(ch).matches("[a-z0-9]")){
                sb.append(ch);
            }
        }
        String sb_str = sb.toString();
        if(sb_str.length()==0) return true;
        if(sb_str.length()==1) return true;
        for(int i = 0; i < sb_str.length()/2; i++){
            if(sb_str.charAt(i)!=sb_str.charAt(sb_str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
