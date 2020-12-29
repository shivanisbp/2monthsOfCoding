/*
Problem Name: 1629. Slowest Key
Problem Link: https://leetcode.com/problems/slowest-key/
*/
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxpress = releaseTimes[0], n = releaseTimes.length;
        char maxchar = keysPressed.charAt(0);
        for(int i=1;i<n;i++){
            if(releaseTimes[i] - releaseTimes[i-1] > maxpress){
                maxpress = releaseTimes[i] - releaseTimes[i-1];
                maxchar = keysPressed.charAt(i);
            }
            else if(releaseTimes[i] - releaseTimes[i-1] == maxpress)
                maxchar = (char)Math.max(keysPressed.charAt(i), keysPressed.charAt(i-1));
        }
        return maxchar;
    }
}
