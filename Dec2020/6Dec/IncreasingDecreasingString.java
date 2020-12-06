/*
Problem Name: 1370. Increasing Decreasing String
Problem Link: https://leetcode.com/problems/increasing-decreasing-string/
*/
class Solution {
    public String sortString(String s) {
        String result = "";
        int cnt[] = new int[26];
        for(char c: s.toCharArray()){
            cnt[c-'a']++;
        }
        
        for(;;){
            boolean finish = true;
            for(int i=0;i<26;i++){
                if(cnt[i] > 0){
                    result += (char)(i + 'a');
                    cnt[i]--;
                    if(cnt[i] > 0)
                        finish = false;
                }
            }
            if(finish)
                break;
            for(int i=25;i>=0;i--){
                if(cnt[i] > 0){
                    result += (char)(i + 'a');
                    cnt[i]--;
                    if(cnt[i] > 0)
                        finish = false;
                }
            }
            if(finish)
                break;
        }   
        return result;
    }
}
