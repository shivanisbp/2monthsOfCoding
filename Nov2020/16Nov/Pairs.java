/*
Problem Name: Pairs
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pairs-16/
*/
import java.util.*;
class Pairs {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int prime[] = new int[100000+1];
        Arrays.fill(prime,1);
        prime[0] = 0;
        prime[1] = 0;
        for(int i=2;i<=100000;i++){
            for(int j=2*i;j<=100000;j+=i)
                prime[j] = 0;
        }
        for(int i=1;i<=100000;i++)
            prime[i] += prime[i-1];
        
        int t = in.nextInt();
        for(;t>0;t--){
            int l = in.nextInt(), r = in.nextInt();
            long primes = prime[r]-prime[l-1], comp = r - l + 1 - primes;
            if(l == 1)
                comp--;
            System.out.println(primes*comp);
        }
    }
}
