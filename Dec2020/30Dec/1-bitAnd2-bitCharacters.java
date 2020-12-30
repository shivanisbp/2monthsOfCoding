/*
Problem Name: 717. 1-bit and 2-bit Characters
Problem Link: https://leetcode.com/problems/1-bit-and-2-bit-characters/
*/
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i;
        for(i=0;i<bits.length - 1;i++)
            if(bits[i] == 1)
                i++;
        return bits.length - 1 == i;
    }
}
