/*
Problem Name: Win-the-Game
Problem Link: https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/practice-problems/algorithm/win-the-game/
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(;t>0;t--){
            int r = in.nextInt(), g = in.nextInt();
            if(r == 0 || g == 0)
                System.out.printf("%1.6f\n",1.0);
            else{
                float prob = 0, prev_prob = 1;
                while(g >= 0){
                    prob += prev_prob*r/(r+g);
                    prev_prob *= (g*1.0/(r+g))*((g-1)*1.0/(r+g-1));
                    g -= 2;
                }
                System.out.printf("%1.6f\n",prob);
            }
        }
    }
}
