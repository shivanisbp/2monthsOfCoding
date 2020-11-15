/*
Problem Name: Roy and Symmetric Logos
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/roy-and-symmetric-logos-1/
*/
import java.util.*;
class RoyAndSymmetricLogos {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt();
            char mat[][] = new char[n][n];
            for(int i=0;i<n;i++)
                mat[i] = in.next().toCharArray();
            boolean sym = true;
            for(int i=0;i<n;i++){
                int l = 0, r = n-1;
                for(;l<=r;l++,r--)
                    if(mat[i][l] != mat[i][r]){
                        sym = false;
                        break;
                    }
                if(!sym)
                    break;
            }
            if(!sym){
                System.out.println("NO");
                continue;
            }
            for(int i=0;i<n;i++){
                int l = 0, r = n-1;
                for(;l<=r;l++,r--)
                    if(mat[l][i] != mat[r][i]){
                        sym = false;
                        break;
                    }
                if(!sym)
                    break;
            }
            if(sym)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
