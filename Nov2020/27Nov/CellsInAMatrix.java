/*
Problem Name:  Cells in a matrix
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/easy-23-6031def9/
*/
import java.io.*;
import java.util.*;

public class CellsInAMatrix {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        long rowcnt = n, colcnt = n;
        int row[] = new int[n], col[] = new int[n];
        for(;k>0;k--){
            int i = in.nextInt(), j = in.nextInt();
            if(row[i-1] == 0){
                row[i-1] = 1;
                rowcnt--;
            }
            if(col[j-1] == 0){
                col[j-1] = 1;
                colcnt--;
            }
            System.out.print((rowcnt*colcnt) + " ");
        }
    }
}
