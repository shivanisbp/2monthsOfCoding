/*
Problem Name: Stack and Queue <Nissan>
Problm Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/staque-1-e790a29f/
*/
import java.util.*;
class StackAndQueue<Nissan> {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k =in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        long lsum = arr[0], rsum = 0;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=n-1;i>n-k;i--){
            rsum += arr[i];
            st.push(arr[i]);
        }
        long max = lsum + rsum;
        for(int i=1;i<k;i++){
            lsum += arr[i];
            rsum -= st.pop();
            max = Math.max(max, lsum + rsum);
        }
        System.out.println(max);
    }
}
