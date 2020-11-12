/*
Problem Name: Long ATM Queue
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/long-atm-queue-3
*/
import java.util.*;
class LongATMQueue {
    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 1, prev = in.nextInt(), cur = -1;
        for(int i=1;i<n;i++){
            cur = in.nextInt();
            if(cur < prev)
                cnt++;
            prev = cur;
        }
        System.out.println(cnt);
    }
}
