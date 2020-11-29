/*
Problem Name: Pair Sums
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/pair-sums/
*/
import java.util.*;
class PairSums {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int arr[] = new int[10000000];
        for(int i=0;i<n;i++)
            arr[in.nextInt()]++;
        boolean pairs = false;
        
        for(int i=0;i<=k;i++){
            if(arr[i] > 0){
                if((k - i == i)){
                    if(arr[i] >= 2)
                        pairs = true;
                }
                else if(arr[k-i] > 0)
                    pairs = true;
            }
            if(pairs)
                break;
        }
        if(pairs)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
