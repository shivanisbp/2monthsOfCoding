/*
Problem Name: Grid and phrase
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/jadvaliioo-62280ff6/
*/
import java.util.*;
class GridAndPhrase {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m =in.nextInt();
        char mat[][] = new char[n][m];
        for(int i=0;i<n;i++)
            mat[i] = in.next().toCharArray();
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 's'){
                    if((j < m-3) && (mat[i][j+1] == 'a') && (mat[i][j+2] == 'b') && (mat[i][j+3] == 'a'))
                        cnt++;
                    if((i < n-3) && (mat[i+1][j] == 'a') && (mat[i+2][j] == 'b') && (mat[i+3][j] == 'a'))
                        cnt++;
                    if((i < n-3) && (j < m-3) && (mat[i+1][j+1] == 'a') && (mat[i+2][j+2] == 'b') && (mat[i+3][j+3] == 'a'))
                        cnt++;
                    if((i >= 3) && (j < m-3) && (mat[i-1][j+1] == 'a') && (mat[i-2][j+2] == 'b') && (mat[i-3][j+3] == 'a'))
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
