/*
Problem Name: Arjit and Printing Press
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/arjit-and-printing-press/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            char[] w = in.next().toCharArray(), r = in.next().toCharArray();
            Arrays.sort(r);
            int li = 0, ri = 0, wlen = w.length, rlen = r.length;
            for(;li<wlen && ri<rlen;){
                if(w[li] > r[ri]){
                    w[li] = r[ri];
                    li++;
                    ri++;
                }
                else
                    li++;
            }
            out.println(new String(w));
        }
        out.flush();
    }
}
