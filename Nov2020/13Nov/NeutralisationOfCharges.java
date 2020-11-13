/*
Problem Name: NeutralisationOfCharges
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/charges-repel/
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), ind = -1;
        String s = in.next();
        char arr[] = s.toCharArray();
        for(char c: s.toCharArray()){
            if(ind == -1)
                arr[++ind] = c;
            else if(arr[ind] == c){
                ind--;
            }
            else
                arr[++ind] = c;
        }
        String ans = "";
        for(int i=0;i<=ind;i++)
            ans += arr[i];
        System.out.println((ind+1)+"\n"+ans);
    }
}
