//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubstring(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
     int longestUniqueSubstring(String s) {
        Map<Character, Integer> store = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (store.containsKey(ch) && store.get(ch) >= left) {
                // Move left just past the last seen index of ch
                left = store.get(ch) + 1;
            }

            store.put(ch, right); // Update last seen index
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}