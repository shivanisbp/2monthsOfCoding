/*
Problem Name: Help Jarvis!
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/help-jarvis-8a39566e/
*/
import java.util.*;
class HelpJarvis! {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(;t>0;t--){
            char arr[] = in.next().toCharArray();
            Arrays.sort(arr);
            boolean move = true;
            for(int i=1;i<arr.length;i++)
                if(arr[i]-arr[i-1] != 1){
                    move = false;
                    break;
                }
            if(move)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
