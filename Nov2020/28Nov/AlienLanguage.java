/*
Problem Name: Alien language
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/alien-language/
*/
import java.util.*;
class AlienLanguage {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            String text = in.next(), pattern = in.next();
            int cnt1[] = new int[26], cnt2[] = new int[26];
            for(char c: text.toCharArray())
                cnt1[c-'a']++;
            for(char c: pattern.toCharArray())
                cnt2[c-'a']++;
            boolean yes = false;
            for(int i=0;i<26;i++)
                if(cnt1[i] > 0 && cnt2[i] > 0){
                    yes = true;
                    break;
                }
            if(yes)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
