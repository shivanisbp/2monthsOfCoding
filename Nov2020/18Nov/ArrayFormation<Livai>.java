/*
Problem Name:  Array Formation <Liv.ai>
Problem Link: https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/circular-list-8e1319c9/
*/
import java.io.*;
import java.util.*; 
public class ArrayFormation<Livai> {
    public static void main(String[] args) throws IOException {
        Reader in = new Reader();
        PrintWriter out = new PrintWriter(System.out);

        boolean check[] = new boolean[1000000+1];
        check[0] = check[1] = true;
        for(int i=2;i<=1000000;i++){
            if(check[i] == false){
                for(int j=2*i;j<=1000000;j+=i){
                    check[j] = true;
                }
            }
        }

        int n = in.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i] = in.nextInt();
        }
 
        int prime[] = new int[n];
        int comp[] = new int[n];
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < n; i++){
            if(check[A[i]] == false){
                prime[cnt1++] = A[i];
            }
            else{
                comp[cnt2++] = A[i];
            }
        }

        for(int i=0;i<cnt1;i++){
            out.print(prime[i]+" ");
        }
        out.println("");
        for(int i=cnt2-1;i>=0;i--){
            out.print(comp[i]+" ");
        }
        out.flush();
    }
    
    static class Reader{
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
}
