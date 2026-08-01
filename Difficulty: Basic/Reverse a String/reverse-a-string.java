class Solution {
    public static String reverseString(String s) {
       StringBuilder str=new StringBuilder();
       str.append(s);
       str.reverse();
       return str.toString();
        
    }
}