/*
Problem Name: STPAR - Street Parade
Problem Link: https://www.spoj.com/problems/STPAR/
*/
import java.util.*;
import java.lang.*;
class Main{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner in = new Scanner(System.in);
		for(;;){
    		int n = in.nextInt();
    		if(n == 0)
    		    break;
    		int arr[] = new int[n];
    		for(int i=0;i<n;i++)
    		    arr[i] = in.nextInt();
    		
    		Stack<Integer> st = new Stack<Integer>();
    		int expected = 1;
    		for(int i=0, ind=0;ind<n;i++){
    		    if((!st.isEmpty()) && (st.peek() == expected)){
    		        st.pop();
    		        expected++;
    		    }
    		    else if(arr[ind] == expected){
    		        ind++;
    		        expected++;
    		    }
    		    else{
    		        st.push(arr[ind++]);
    		    }
    		}
    		boolean possible = true;
    		while(!st.isEmpty()){
    		    if(st.pop() == expected)
    		        expected++;
    		    else{
    		        possible = false;
    		        break;
    		    }
    		}
    		if(possible)
    		    System.out.println("yes");
    		else
    		    System.out.println("no");
		}
	}
}
