/*
Problem Name: Monk and Power of Time
Problem Link: https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/monk-and-power-of-time-3a648bf0/
*/
import java.util.*;
class MonkAndPowerOfTime {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<n;i++)
            q.add(in.nextInt());
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        int time = 0;
        for(int i=0;q.size()>0;){
            if(arr[i] == q.peek()){
                i++;
                q.remove();
            }
            else
                q.add(q.remove());
            time++;
        }
        System.out.println(time);
    }
}
