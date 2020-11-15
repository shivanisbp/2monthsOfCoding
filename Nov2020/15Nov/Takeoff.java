/*
Problem Name: Takeoff
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/no-sharing-capillary-82ed3fe2/
*/
import java.util.*;
class Takeoff {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt(), p = in.nextInt(), q = in.nextInt(), r = in.nextInt();
            int arr[] = new int[n+1];
            for(int i=p;i<=n;i+=p)
                arr[i]++;
            for(int i=q;i<=n;i+=q)
                arr[i]++;
            for(int i=r;i<=n;i+=r)
                arr[i]++;
            int ans = 0;
            for(int i=1;i<=n;i++)
                if(arr[i] == 1)
                    ans++;
            System.out.println(ans);
        }
    }
}
