/*
Problem Name: Counting Frog Paths
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/counting-frog-paths-1abd84d5/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        int s = in.nextInt(), t = in.nextInt();
        int cnt = 0;
        for(int i=y;i<=y+s;i++){
            for(int j=x;j<=x+s;j++){
                if(i+j <= t){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
