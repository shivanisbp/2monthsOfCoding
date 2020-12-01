/*
Problem Name: Statistics
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/statistics-2/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            in.next();
            String game = in.next();
            if(map.containsKey(game))
                map.put(game, map.get(game) + 1);
            else
                map.put(game, 1);
        }
        String ans = "";
        int max = 0;
        for(String s: map.keySet()){
            if(max < map.get(s)){
                ans = s;
                max = map.get(s);
            }
        }
        out.println(ans);
        out.println(map.containsKey("football") ? map.get("football") : 0);
        out.flush();
    }
}
