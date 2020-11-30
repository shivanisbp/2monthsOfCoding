/*
Problem Name: Easy one
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/easy-one-8/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashMap<Long,Integer> map = new HashMap<Long,Integer>();
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt(), q = in.nextInt();
            for(;n>0;n--){
                long ele = in.nextLong();
                if(map.containsKey(ele))
                    map.put(ele,map.get(ele) + 1);
                else
                    map.put(ele,1);
            }
            for(;q>0;q--){
                long ele = in.nextLong();
                if(map.containsKey(ele))
                    out.println(map.get(ele));
                else
                    out.println(0);
            }
            map.clear();
        }
        out.flush();
    }
}
