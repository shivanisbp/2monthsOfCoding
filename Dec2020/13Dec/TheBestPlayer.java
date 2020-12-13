/*
Problem Name: The Best Player
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/the-best-player-1/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), t =in.nextInt();
        List<Fan> list = new ArrayList<Fan>();
        for(int i=0;i<n;i++){
            list.add(new Fan(in.next(),in.nextInt()));
        }
        Collections.sort(list);
        for(int i=0;i<t;i++)
            out.println(list.get(i).name);
        out.flush();
    }
    static class Fan implements Comparable<Fan>{
        String name;
        int quotient;
        Fan(String n,int q){
            name = n;
            quotient = q;
        }
        public int compareTo(Fan f){
            if(f.quotient != quotient)
                return f.quotient - quotient;
            return name.compareTo(f.name);
        }
    }
}
