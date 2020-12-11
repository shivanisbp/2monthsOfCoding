/*
Problem Name: Repeated K Times
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/repeated-k-times/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), k;
        int map[] = new int[100001];
        for(int i=0;i<n;i++)
            map[in.nextInt()]++;
        k = in.nextInt();
        for(int i=1;i<100001;i++)
            if(map[i] == k){
                System.out.print(i);
                break;
            }
        out.flush();
    }
}
