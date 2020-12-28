/*
Problem Name: 1652. Defuse the Bomb
Problem Link: https://leetcode.com/problems/defuse-the-bomb/
*/
class Solution {
    public int[] decrypt(int[] code, int k) {
        int key[] = new int[code.length];
        int n = code.length;
        for(int i=0;i<n;i++){
            int sum = 0, d;
            if(k < 0)
                d = -1;
            else
                d = 1;
            for(int j=(i+d+n)%n,cnt=0;cnt<Math.abs(k);j=(j+d+n)%n,cnt++)
                sum += code[j];
            key[i] = sum;
        }
        return key;
    }
}
