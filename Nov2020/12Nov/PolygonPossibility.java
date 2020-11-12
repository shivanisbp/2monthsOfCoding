/*
Problem Name: Polygon Possibility
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/polygon-possible/
*/
import java.util.*;
class PolygonPossibility {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = in.nextInt();
            Arrays.sort(arr);
            for(int i=1;i<n-1;i++)
                arr[i] += arr[i-1];
            if(arr[n-1] < arr[n-2])
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
