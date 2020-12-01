/*
Problem Name: Chetan vs Fauji
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/chetan-vs-fauji/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        for(int i=0;i<n;i++){
            long p = in.nextLong() + in.nextLong();
            if(map.containsKey(p))
                map.put(p, map.get(p) + 1);
            else
                map.put(p, 1l);
        }
        long s = in.nextLong(), cnt = 0;
        for(long i: map.keySet()){
            if(map.containsKey(s+i))
                cnt += map.get(i)*map.get(s+i);
        }
        out.println(cnt);
        out.flush();
    }
}
