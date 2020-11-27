/*
Problem Name: Maximum occurrence
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/
*/
import java.util.*;
class MaximumOccurrence {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int cnt[] = new int[128];
        String s = in.nextLine();
        for(char c: s.toCharArray())
            cnt[c]++;
        char ch = s.charAt(0);
        int max = 1;
        for(int i=0;i<128;i++)
            if(cnt[i] > max){
                max = cnt[i];
                ch = (char)i;
            }
        System.out.print(ch+" "+max);
    }
}
