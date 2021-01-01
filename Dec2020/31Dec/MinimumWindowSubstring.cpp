/*
Problem name: 76. Minimum Window Substring
Problem link: https://leetcode.com/problems/minimum-window-substring/
*/

class Solution {
public:
    string minWindow(string s, string t) {
        map<char,int> goal; 
        for(int i=0;i<t.length();++i)
            goal[t[i]]++;
        
        int l=0, r=0, finall=0,finalr=0;
        int minWindowLengthSoFar=s.length();
        int matching=0, totalToMatch=t.length();
        bool found=false;
        
        while(r<s.length()){
            char c=s[r];
            if(goal.count(c)){
                if(goal[c]>0)
                    matching++;
                goal[c]--;
            }
            while(matching==totalToMatch && l<=r){
                if(r-l+1<=minWindowLengthSoFar){
                    minWindowLengthSoFar=r-l+1;
                    found=true;
                    finall=l;
                    finalr=r;
                }
                if(l==r)
                    break;
                c=s[l];
                if(goal.count(c)){
                    goal[c]++;
                    if(goal[c]>0)
                        matching--;
                }
                l++; 
            }
            r++;
        }
        if(!found)
            return "";
        else
            return s.substr(finall,finalr-finall+1);
    }
};
