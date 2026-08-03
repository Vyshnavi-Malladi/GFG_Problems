class Solution {
    public boolean binarySearch(int[] arr, int k) {
        
        int l=0,h=arr.length-1,mid=0;
        while(l<=h)
        {
             mid=(l+h)/2;
            if(k==arr[mid])
            {
                return true;
            }
            else if(k<arr[mid])
            {
                h=mid-1;
               
            }
            else
            {
                l=mid+1;
            
            }
        }
        return false;
        
    }
}