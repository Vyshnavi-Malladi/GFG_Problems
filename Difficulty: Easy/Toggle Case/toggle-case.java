class Solution {
    public String toggleCase(String s) {
        
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
          
            if(ch>='A' && ch<='Z')
            {
                ans.append(Character.toLowerCase(ch));
            }
            else if(ch>='a' && ch<='z')
            {
                ans.append(Character.toUpperCase(ch));
            }
            else
            {
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}
