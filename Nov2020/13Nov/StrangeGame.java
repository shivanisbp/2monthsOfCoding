/*
Problem Name: Strange Game
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/strange-game-1-7e758acb-1bff10f0/
*/
import java.util.*;
import java.io.*;
class StrangeGame {
    public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        for(;t>0;t--){
            String[] inp = in.readLine().split(" ");
            int n = Integer.parseInt(inp[0]), k = Integer.parseInt(inp[1]);
            int alice[] = new int[n];
            inp = in.readLine().split(" ");
            for(int i=0;i<n;i++)
                alice[i] = Integer.parseInt(inp[i]);
            int max = 0;
            inp = in.readLine().split(" ");
            for(int i=0;i<n;i++)
                max = Math.max(max,Integer.parseInt(inp[i]));
            long time = 0;
            max++;
            for(int i=0;i<n;i++)
                if(max > alice[i])
                    time += (max-alice[i])*k;
            System.out.println(time);
        }
    }
}
