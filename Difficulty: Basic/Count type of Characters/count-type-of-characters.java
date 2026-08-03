class Sol {
    int[] count(String s) {
      
      int l=0;
      int u=0;
      int sc=0;
      int n=0;
      for(int i=0;i<s.length();i++)
      {
         char ch=s.charAt(i);
         if(ch>='A' && ch<='Z')
         {
             u++;
         }
         else if(ch>='a' && ch<='z')
         {
             l++;
         }
         else if(ch>='0' && ch<='9')
         {
             n++;
         }
         else
         {
             sc++;
         }
      }
      return new int[]{u,l,n,sc};
        
    }
}