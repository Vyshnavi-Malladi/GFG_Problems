class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        

        // Step 1: Check length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Create frequency array
        int[] count = new int[26];

        // Step 3: Count characters
        for (int i = 0; i < s1.length(); i++) {

            count[s1.charAt(i) - 'a']++;

            count[s2.charAt(i) - 'a']--;
        }

        // Step 4: Check frequency
        for (int i = 0; i < 26; i++) {

            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }


        

}