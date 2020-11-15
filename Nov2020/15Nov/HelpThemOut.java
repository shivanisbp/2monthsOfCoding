/*
Problem Name: Help them Out
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/solve-friends-problem/
*/
import java.util.*;
class HelpThemOut {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), g = -1;
        int dec[] = new int[n], div[] = new int[n];
        for(int i=0;i<n;i++){
            g = in.nextInt();
            while(g>0){
                if(g%2 == 0){
                    g/=2;
                    div[i]++;
                }
                else{
                    g--;
                    dec[i]++;
                }
            }
        }
        for(int i=1;i<n;i++){
            dec[i] += dec[i-1];
            div[i] = Math.max(div[i],div[i-1]);
        }
        System.out.println(dec[n-1] + div[n-1]);
    }
}
