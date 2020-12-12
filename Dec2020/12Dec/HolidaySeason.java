/*
Problem Name: Holiday Season
Problem Link: https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/holiday-season-ab957deb/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        long ans = 0;
        char arr[] = in.next().toCharArray();
        for(int i=0;i<n;i++){
            int cnt[] = new int[26];
            for(int j=0;j<i;j++)
                cnt[arr[j] - 'a']++;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    for(int k=i+1;k<j;k++)
                        if(cnt[arr[k] - 'a'] > 0)
                            ans += cnt[arr[k] - 'a'];
                }
            }
        }
        out.println(ans);
        out.flush();
    }
}
