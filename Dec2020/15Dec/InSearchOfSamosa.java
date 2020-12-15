/*
Problem Name: In search of Samosa
Problem Link: https://www.hackerearth.com/practice/algorithms/greedy/basics-of-greedy-algorithms/practice-problems/algorithm/in-search-of-samosa-pledge-easy-3/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt(), k =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Arrays.sort(arr);
        int cnt = 0;
        for(int i=0;i<n;i++){
            k -= arr[i];
            if(k < 0)
                break;
            cnt++;
        }
        out.println(cnt);
        out.flush();
    }
}
