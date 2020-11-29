/*
Problem Name: Frequency of Students
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/frequency-of-students/
*/
import java.util.*;
class FrequencyOfStudents {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        int n = in.nextInt();
        for(;n>0;n--){
            String name = in.next();
            if(map.containsKey(name))
                map.put(name, map.get(name) + 1);
            else
                map.put(name, 1);
        }
        for(String name: map.keySet())
            System.out.println(name+" "+map.get(name));
    }
}
