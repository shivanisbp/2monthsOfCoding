/*
Problem Name: 1636. Sort Array by Increasing Frequency
Problem Link: https://leetcode.com/problems/sort-array-by-increasing-frequency/
*/
class Solution {
    public int[] frequencySort(int[] nums) {
        int dp[] = new int[202];
        for(int i:nums){
            if(i >= 0)
                dp[i]++;
            else
                dp[i*-1 + 100]++;
        }
        List<Int> list = new ArrayList<Int>();
        for(int i=0;i<202;i++){
            if(i <= 100){
                if(dp[i] > 0)
                    list.add(new Int(i,dp[i]));
            }
            else{
                if(dp[i] > 0)
                    list.add(new Int(-1*(i-100),dp[i]));
            }
        }
        Collections.sort(list);
        int ind = 0;
        for(Int i:list){
            for(int j=0;j<i.freq;j++,ind++)
                nums[ind] = i.val;
        }
        return nums;
    }
    static class Int implements Comparable<Int>{
        int val, freq;
        Int(int v, int f){
            val = v;
            freq = f;
        }
        public int compareTo(Int i){
            if(i.freq != freq)
                return freq - i.freq;
            return i.val - val;
        }
    }
}
