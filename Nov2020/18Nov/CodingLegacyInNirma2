/*
Problem Name: Coding Legacy in Nirma 2
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/coding-legacy-in-nirma-2/
*/
import java.util.*;
class CodingLegacyInNirma2 {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt();
            long arr[] = new long[n];
            for(int i=0;i<n;i++)
                arr[i] = in.nextLong();
            long ans = 0;
            Stack<Long> st = new Stack<Long>();
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && (arr[i] < st.peek())){
                    ans = Math.max(ans, arr[i] | st.pop());
                }
                if(st.isEmpty())
                    st.push(arr[i]);
                else if(arr[i] > st.peek()){
                    ans = Math.max(ans, arr[i] | st.peek());
                    st.push(arr[i]);
                }
            }
            System.out.println(ans);
        }
    }
}
