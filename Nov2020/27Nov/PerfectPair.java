/*
Problem Name:  Perfect Pair
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/perfect-pair-df920e90/
*/
import java.util.*;
class PerfectPair {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        boolean perfect[] = new boolean[2001];
        for(int i=0;i<50;i++){
            if(i*i<2001)
                perfect[i*i] = true;
            if(i*i*i<2001)
                perfect[i*i*i] = true;
        }

        for(;t>0;t--){
            int n = in.nextInt();
            int map[] = new int[1003];
            for(int i=0;i<n;i++){
                map[in.nextInt()]++;
            }
            int cnt = 0;
            for(int i=0;i<=1000;i++){
                if(perfect[i+i])
                    cnt += map[i]*(map[i]-1)/2;
                for(int j=i+1;j<=1000;j++){
                    if(perfect[i+j])
                        cnt += map[i]*map[j];
                }
            }
            System.out.println(cnt);
        }
    }
}
