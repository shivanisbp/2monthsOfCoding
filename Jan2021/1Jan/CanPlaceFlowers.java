/*
Problem Name: 605. Can Place Flowers
Problem Link: https://leetcode.com/problems/can-place-flowers/
*/
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0, len = flowerbed.length, i;
        for(i=0;i<len && flowerbed[i]==0;i++,cnt++);
        if(i == len)
            n -= (cnt+1)/2;
        else
            n-= cnt/2;
        cnt = 0;
        for(;i<len;i++){
            if(flowerbed[i] == 0)
                cnt++;
            else{
                n-= (cnt-1)/2;
                cnt = 0;
            }
        }
        n -= cnt/2;
        return n <= 0;
    }
}
