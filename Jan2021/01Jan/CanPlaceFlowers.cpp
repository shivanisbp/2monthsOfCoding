/*
Problem name: 605. Can Place Flowers
Problem link: https://leetcode.com/problems/can-place-flowers/
*/

class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {
        for(int i=0;i<flowerbed.size();++i){
            if(n==0)
                break;
            if(!flowerbed[i]){
                if (i > 0 && flowerbed[i-1]) continue;
                if (i < flowerbed.size() - 1 && flowerbed[i + 1]) continue;
                flowerbed[i]=1;
                n--;
            }
        }
        if(!n)
            return true;
        else
            return false;
    }
};
