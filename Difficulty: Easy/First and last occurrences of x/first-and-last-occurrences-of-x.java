//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

            String inputLine1[] = br.readLine().trim().split(" ");
            int n = inputLine1.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(x, arr);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
    ArrayList<Integer> result = new ArrayList<>();
    int first = first(arr,x);
    int last = last(arr,x);
    if(first == -1)
    result.add(-1);
    else{
    result.add(first);
    result.add(last);
    }
    return result;
    }
    
    public int first(int arr[], int k)
    {
        int first = -1;
        int left = 0, right = arr.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] == k)
            {
                first = mid;
                right = mid - 1;
            }
            else if(arr[mid] < k)
            left = mid + 1;
            else
            right = mid - 1;
        }
        return first;
    }
    
    public int last(int arr[], int k)
    {
        int last = -1;
        int left = 0, right = arr.length - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
             if(arr[mid] == k)
             {
                 last = mid;
                 left = mid + 1;
             }
             else if(arr[mid] < k)
             left = mid + 1;
             else
             right = mid - 1;
        }
        return last;
    }
}
