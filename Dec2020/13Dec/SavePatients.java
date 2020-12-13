/*
Problem Name: Save Patients
Problem Link: https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/
*/
import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] vaccines = new int[n], patients = new int[n];
        for(int i=0;i<n;i++)
            vaccines[i] = in.nextInt();
        for(int i=0;i<n;i++)
            patients[i] = in.nextInt();
        Arrays.sort(vaccines);
        Arrays.sort(patients);
        boolean cured = true;
        for(int i=0;i<n;i++){
            if(patients[i] > vaccines[i]){
                cured = false;
                break;
            }
        }
        if(cured)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
