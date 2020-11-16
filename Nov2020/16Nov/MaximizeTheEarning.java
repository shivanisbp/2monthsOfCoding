/*
Problem Name: Maximize the Earning
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-the-earning-137963bc-323025a6/
*/
import java.util.*;
import java.io.*;
class MaximizeTheEarning {
    public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(in.readLine());
        for(;s>0;s--){
            String[] str = in.readLine().split(" ");
            int n = Integer.parseInt(str[0]), r = Integer.parseInt(str[1]), earning = 0, max = 0;
            str = in.readLine().split(" ");
            for(int i=0;i<n;i++){
                int cur = Integer.parseInt(str[i]);
                if(max < cur){
                    earning += r;
                    max = cur;
                }
            }
            System.out.println(earning);
        }
    }
}
