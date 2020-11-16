/*
Problem Name: Mark The Answer
Problem Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/mark-the-answer-1/
*/
import java.util.*;
class MarkTheAnswer {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), x = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int cnt = 0, chance = 1;
        for(int i=0;i<n;i++){
            if(arr[i] <= x)
                cnt++;
            else if(chance == 1){
                chance--;
            }
            else{
                break;
            }
        }
        System.out.println(cnt);
    }
}
