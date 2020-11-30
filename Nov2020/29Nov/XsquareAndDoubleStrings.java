/*
Problem Name: Xsquare And Double Strings
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/xsquare-and-double-strings-1/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            String s = in.next();
            Set<Character> set = new HashSet<Character>();
            boolean possible = false;
            for(char c: s.toCharArray()){
                if(set.contains(c)){
                    possible = true;
                    break;
                }
                set.add(c);
            }
            if(possible)
                out.println("Yes");
            else
                out.println("No");
        }
        out.flush();
    }
}
