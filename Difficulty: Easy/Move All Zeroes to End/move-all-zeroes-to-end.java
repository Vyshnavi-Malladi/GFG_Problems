class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        if(n==0 || n==1)
        {
            return;
        }
        int nz=0,z=0;
        while(nz<n)
        {
            if(arr[nz]!=0)
            {
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else
            {
                nz++;
            }
        }
        
    }
}