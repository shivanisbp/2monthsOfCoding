/*
Problem name: 1033. Moving Stones Until Consecutive
Problem link: https://leetcode.com/problems/moving-stones-until-consecutive/
*/

class Solution {
public:
    vector<int> numMovesStones(int a, int b, int c) {
        int m1=min(a,min(b,c));
        int m3=max(a,max(b,c));
        int m2=a+b+c-m1-m3;
        a=m1;
        b=m2;
        c=m3;
        cout<<a<<b<<c;
        
        if(c-a == 2)
            return {0,0};
        if(b-a <= 2 || c-b <= 2)
            return {1, c-a-2};
        return {2, c-a-2};
    }
};
