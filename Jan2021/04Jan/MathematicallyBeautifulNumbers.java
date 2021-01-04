/*
Problem Name: Mathematically beautiful numbers
Problem Link: https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/mathematically-beautiful-numbers-174a158e/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for(;t>0;t--){
            long x = in.nextLong(), k = in.nextLong();
            boolean possible = true;
            while(x > 0){
                if(x%k > 1){
                    possible = false;
                    break;
                }
                x /= k;
            }
            if(possible)
                out.println("YES");
            else
                out.println("NO");
        }
        out.flush();
    }
}
