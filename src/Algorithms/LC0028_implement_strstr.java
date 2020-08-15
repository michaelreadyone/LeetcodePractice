class LC0028_implement_strstr {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(needle.length()>haystack.length()) return -1;

        for(int i = 0; i < haystack.length();i++){
            // trick the equivanence check when one char from haystack equals to the first char of needle
            if(haystack.charAt(i)==needle.charAt(0) && haystack.length()-i >= needle.length() ){
                if(needle.length()==1) return i;
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
