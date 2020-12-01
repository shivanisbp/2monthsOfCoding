/*
Problem Name: Festivals
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/suzakus-festivals-14dacd7c/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt();
            TreeMap<String,PriorityQueue<Long>> map = new TreeMap<String,PriorityQueue<Long>>();
            for(int i=0;i<n;i++){
                String s = in.next();
                long num = in.nextLong();
                if(map.containsKey(s)){
                    map.get(s).add(num);
                }
                else{
                    PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
                    pq.add(num);
                    map.put(s,pq);
                }
            }
            String ans = "";
            long val = 0;
            for(String s: map.keySet()){
                long temp = 0, size = 3;
                while(!map.get(s).isEmpty() && size > 0){
                    temp += map.get(s).remove();
                    size--;
                }
                if(temp > val){
                    ans = s;
                    val = temp;
                }
            }
            out.println(ans+" "+val);
        }
        out.flush();
    }
}
