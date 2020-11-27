/*
Problem Name: Bob and String
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/bob-and-string-easy/
*/
import java.util.*;
class BobAndString {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(;n>0;n--){
            String s = in.next(), t = in.next();
            int sarr[] = new int[26], tarr[] = new int[26];
            for(char c: s.toCharArray())
                sarr[c-'a']++;
            for(char c: t.toCharArray())
                tarr[c-'a']++;
            int operations = 0;
            for(int i=0;i<26;i++){
                operations += Math.abs(sarr[i] - tarr[i]);
            }
            System.out.println(operations);
        }
    }
}
