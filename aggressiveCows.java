//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int answer = 0;
        Arrays.sort(stalls);
        int h = stalls[stalls.length - 1] - stalls[0];
        int l = 1;
        
        while(l <= h) {
            int mid = l + (h - l)/2;
            if(checkIfPlacingPossible(stalls, k, mid)) {
                answer = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        
        return answer;
    }
    
    static boolean checkIfPlacingPossible(int[] stalls, int k, int d) {
        int p = stalls[0];
        int count = 1;
        
        for(int i = 1; i < stalls.length; i++) {
            if(stalls[i] - p >= d) {
                count++;
                p = stalls[i];
            }
        }
        return (count >= k);
    }
}
