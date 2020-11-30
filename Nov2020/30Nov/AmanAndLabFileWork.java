/*
Problem Name: Aman and lab file work
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/aman-and-lab-file-work-8cd1d24c/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        PriorityQueue<Order> pq = new PriorityQueue<Order>();
        for(int i=0;i<n;i++){
            int t = in.nextInt(), d = in.nextInt();
            pq.add(new Order(i+1, t+d));
        }
        for(int i=0;i<n;i++){
            out.print(pq.remove().index+" ");
        }
        out.flush();
    }
    static class Order implements Comparable<Order>{
        int index;
        int time;
        Order(int i, int t){
            index = i;
            time = t;
        }
        public int compareTo(Order o){
            if(time != o.time)
                return time - o.time;
            return index - o.index;
        }
    }
}
