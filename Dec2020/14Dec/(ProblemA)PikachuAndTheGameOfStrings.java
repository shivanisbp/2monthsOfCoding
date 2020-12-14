/*
Problem Name: ( Problem A ) Pikachu and the Game of Strings
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/pikachu-and-the-game-of-strings-1-8c22a8ce/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        String s = in.next(), t = in.next();
        int days = 0;
        for(int i=0;i<n;i++){
            int diff = (t.charAt(i) - s.charAt(i) + 26)%26;
            days += (diff/13) + (diff%13);
        }
        out.println(days);
        out.flush();
    }
}
