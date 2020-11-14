/*
Problem Name: Find the String
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/find-the-string-4014dec6/
*/
import java.util.*;
class FindTheString {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            int n = in.nextInt(), m = in.nextInt();
            int mat[][] = new int[n][26];
            for(int i=0;i<n;i++){
                String s = in.next();
                for(char c: s.toCharArray())
                    mat[i][c-'a']++;
            }
            String s = in.next();
            int len = s.length(), cur = 0;
            boolean possible = true;
            for(int i=0;i<len;i++){
                char c = s.charAt(i);
                if(mat[cur][c-'a'] == 0){
                    possible = false;
                    break;
                }
                mat[cur][c-'a']--;
                cur = (cur + 1)%n;
            }
            if(possible)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
