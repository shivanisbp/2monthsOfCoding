/*
Problem Name: Hamiltonian and Lagrangian
Problem link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/hamiltonian-and-lagrangian/
*/
import java.util.*;
class HamiltonianAndLagrangian {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int max = arr[n-1];
        String ans = arr[n-1] + "";
        for(int i=n-2;i>=0;i--){
            max = Math.max(max, arr[i]);
            if(max == arr[i])
                ans = arr[i] + " " + ans;
        }
        System.out.println(ans);
    }
}
