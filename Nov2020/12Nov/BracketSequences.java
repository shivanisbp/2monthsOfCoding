/*
Problem Name: Bracket Sequences
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/bracket-sequence-1-40eab940/
*/
import java.util.*;
class BracketSequences {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int pos = 0, neg = 0, n = s.length(), min = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '(')
                arr[i] = 1;
            else
                arr[i] = -1;
        }
        for(int i=1;i<n;i++){
            arr[i] += arr[i-1];
            min = Math.min(min, arr[i]);
        }
        if(arr[n-1] != 0)
            System.out.println(0);
        else{
            int ans = 0;
            for(int i=0;i<n;i++){
                if(min == arr[i])
                    ans++;
            }
            System.out.println(ans);
        }
    }
}
