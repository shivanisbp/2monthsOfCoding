/*
Problem Name: Micro and Array Update
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/
*/
import java.util.*;
class MicroAndArrayUpdate {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt(), k = in.nextInt();
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){ 
                int ai = in.nextInt();
                if(ai < min)
                    min = ai;
            }
            System.out.println(Math.max(k-min,0));       
        }
    }
}
