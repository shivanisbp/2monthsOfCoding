/*
Problem Name: Modify Sequence
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/modify-sequence/
*/
import java.util.*;
class ModifySequence {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), prev = in.nextInt();
        for(int i=1;i<n;i++){
            int cur = in.nextInt();
            prev = cur - prev;
            if(prev < 0)
                break;
        }
        if(prev == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
