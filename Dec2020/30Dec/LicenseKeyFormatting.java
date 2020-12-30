/*
Problem Name: 482. License Key Formatting
Problem Link: https://leetcode.com/problems/license-key-formatting/submissions/
*/
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        String ans = "";
        for(int i=S.length()-1,cnt=0;i>=0;i--){
            if(S.charAt(i) != '-'){
                ans = S.charAt(i) + ans;
                cnt++;
                if(cnt%K == 0){
                    ans = '-' + ans;
                    cnt = 0;
                }
            }
        }
        if(ans.length() == 0)
            return ans;
        if(ans.charAt(0) == '-')
            return ans.substring(1);
        return ans;
    }
}
