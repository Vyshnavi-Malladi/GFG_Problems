class Solution {
    public String removeSpaces(String s) {
        
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                str.append(ch);
            }
        }
        return str.toString();
        
    }
}