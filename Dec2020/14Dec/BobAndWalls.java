/*
Problem Name: Bob and Walls
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/bob-and-walls/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt(), last = 0, cnt = 0;
            for(int i=0;i<n;i++){
                int h = in.nextInt();
                if(h > last){
                    cnt++;
                    last = h;
                }
            }
            out.println(cnt);
        }
        out.flush();
    }
}
