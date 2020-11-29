/*
Problem Name: All Vowels
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/all-vowels-2/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        char s[] = in.next().toCharArray();
        Set<Character> set = new HashSet<Character>();
        boolean all = false;
        for(char c: s){
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': set.add(c);
            }
            if(set.size() == 5){
                all = true;
                break;
            }
        }
        if(all)
            out.println("YES");
        else
            out.println("NO");
        out.flush();
    }
}
