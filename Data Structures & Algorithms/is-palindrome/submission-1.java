class Solution {
    public boolean isChar(char c){
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
    public boolean isPalindrome(String s) {
        
        int x=0,y=s.length()-1;
        while(x<y){
            while(x<y && !isChar(s.charAt(x)))x++;
            while(x<y && !isChar(s.charAt(y)))y--;
            if(Character.toLowerCase(s.charAt(x))!=(Character.toLowerCase(s.charAt(y))))return false;
            x++;y--;
        }
        return true;
    }
}
