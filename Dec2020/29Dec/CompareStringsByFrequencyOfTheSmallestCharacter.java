/*
Problem Name: 1170. Compare Strings by Frequency of the Smallest Character
Problem Link: https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
*/
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int n = words.length, w[] = new int[n];
        for(int i=0;i<n;i++){
            int temp[] = new int[26];
            for(char c:words[i].toCharArray())
                temp[c - 'a']++;
            for(int j=0;j<26;j++)
                if(temp[j] != 0){
                    w[i] = temp[j];
                    break;
                }
        }
        Arrays.sort(w);
        n = queries.length;
        int q[] = new int[n];
        for(int i=0;i<n;i++){
            int temp[] = new int[26];
            for(char c:queries[i].toCharArray())
                temp[c - 'a']++;
            for(int j=0;j<26;j++)
                if(temp[j] != 0){
                    q[i] = temp[j];
                    break;
                }
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int l = 0, r = words.length - 1, count = 0; 
            while(l <= r){
                int mid = l + (r-l)/2; 
                if (w[mid] <= q[i]){ 
                    count = mid + 1; 
                    l = mid + 1; 
                } 
                else
                    r = mid - 1; 
            } 
            ans[i] = words.length - count;
        }
        return ans;        
    }
}
