/*
Problem Name: Sort it out!
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/sort-it-out/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        List<Number> list = new ArrayList<Number>();
        int n = in.nextInt();
        for(int i=0;i<n;i++)
            list.add(new Number(in.nextInt(), i));
        Collections.sort(list);
        for(int i=0;i<n;i++){
            out.print(list.get(i).ind+" ");
        }
        out.flush();
    }
    static class Number implements Comparable<Number>{
        int num, ind;
        Number(int n,int i){
            num = n;
            ind = i;
        }
        public int compareTo(Number n){
            return num - n.num;
        }
    }
}
