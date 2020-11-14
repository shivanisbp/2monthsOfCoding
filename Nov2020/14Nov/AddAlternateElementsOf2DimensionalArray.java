/*
Problem Name: Add Alternate Elements of 2-Dimensional Array
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/add-alternate-elements-of-2-dimensional-array/
*/
import java.util.*;
class AddAlternateElementsOf2DimensionalArray {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int mat[][] = new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                mat[i][j] = in.nextInt();
        System.out.println(mat[0][0] + mat[0][2] + mat[1][1] + mat[2][0] + mat[2][2]);
        System.out.println(mat[0][1] + mat[1][0] + mat[1][2] + mat[2][1]);
    }
}
