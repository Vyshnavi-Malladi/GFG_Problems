class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
          if (arr.length == 0) {
            return result;
        }
        int rd=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[rd]!=arr[i])
            {
                rd++;
                arr[rd]=arr[i];
            }
        }
          for (int i = 0; i <= rd; i++) {
            result.add(arr[i]);
        }
        
        return result;
        
    }
}
