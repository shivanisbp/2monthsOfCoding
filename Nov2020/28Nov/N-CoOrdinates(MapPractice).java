/*
Problem Name: N - Co Ordinates (Map Practice)
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/n-co-ordinates-map-practice/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        TreeMap<Integer,TreeMap<Integer,Integer>> map = new TreeMap<Integer,TreeMap<Integer,Integer>>();
        for(;n>0;n--){
            int x = in.nextInt(), y = in.nextInt();
            if(map.containsKey(x)){
                if(map.get(x).containsKey(y))
                    map.get(x).put(y, map.get(x).get(y) + 1);
                else
                    map.get(x).put(y, 1);
            }
            else{
                TreeMap<Integer,Integer> innerMap = new TreeMap<Integer,Integer>();
                innerMap.put(y, 1);
                map.put(x,innerMap);
            }
        }
        for(int x: map.keySet()){
            for(int y: map.get(x).keySet())
                out.println(x+" "+y+" "+map.get(x).get(y));
        }
        out.flush();
    }
}
