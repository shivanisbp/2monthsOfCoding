/*
Problem Name: Mind Palaces
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/mind-palaces-3/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String s[] = in.readLine().split(" ");
        int n = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
        int mat[][] = new int[n][m];
        for(int i=0;i<n;i++){
            s = in.readLine().split(" ");
            for(int j=0;j<m;j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        int q = Integer.parseInt(in.readLine());
        for(;q>0;q--){
            int x = Integer.parseInt(in.readLine());
            boolean found = false;
            for(int i=0;i<n;i++){
                if((x >= mat[i][0]) && (x <= mat[i][m-1])){
                    int ind = search(mat, i, x);
                    if(ind != -1){
                        out.println(i+" "+ind);
                        found = true;
                        break;
                    }
                }
            }
            if(!found)
                out.println("-1 -1");
        }
        out.flush();
    }
    static int search(int mat[][], int row, int x){
        int l = 0, r = mat[0].length - 1;
        while(l<=r){
            int mid = (l + r)/2;
            if(mat[row][mid] == x)
                return mid;
            else if(mat[row][mid] > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
