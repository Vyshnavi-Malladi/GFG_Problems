class Solution {
    boolean isPalindrome(String s) {
      
       StringBuilder rev=new StringBuilder();
       
       for(int i=s.length()-1;i>=0;i--)
       {
          rev.append(s.charAt(i));
       }
       return s.equals(rev.toString());
    }
    
    
}