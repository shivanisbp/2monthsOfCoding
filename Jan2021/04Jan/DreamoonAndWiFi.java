/*
Problem Name: Dreamoon and WiFi
Problem Link: http://codeforces.com/problemset/problem/476/B
*/
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next(), s2 = in.next();
        int original_pos = 0;
        for(char c:s1.toCharArray())
            original_pos += (c == '+' ? 1 : -1);
        int ques = 0, supposed_pos = 0;
        for(char c:s2.toCharArray()){
            ques += (c == '?' ? 1 : 0);
            supposed_pos += (c == '+' ? 1 : -1);
        }
        if(ques == 0){
            if(supposed_pos == original_pos)
                System.out.println(1d);
            else
                System.out.println(0d);
        }
        else{
            double prob = 0;
            int possibilities = (int)Math.pow(2,ques), temp, position;
            for(int i=0;i<possibilities;i++){
                temp = i;
                position = 0;
                for(char c:s2.toCharArray()){
                    if(c == '?'){
                        if((temp & 1) == 0)
                            position++;
                        else
                            position--;
                        temp >>= 1;
                    }
                    else{
                        position += (c == '+' ? 1 : -1);
                    }
                }
                if(position == original_pos)
                    prob++;
            }
            System.out.println(prob/possibilities);
        }
    }
}
