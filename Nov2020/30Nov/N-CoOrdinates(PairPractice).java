/*
Problem Name: N - Co Ordinates (Pair Practice)
Problem Link: https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/n-co-ordinates-pair-practice/
*/
import java.io.*;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        TreeMap<Pair,Integer> map = new TreeMap<Pair,Integer>();
        for(int i=0;i<n;i++){
            int x = in.nextInt(), y = in.nextInt();
            Pair p = new Pair(x,y);
            if(map.containsKey(p))
                map.put(p, map.get(p) + 1);
            else
                map.put(p,1);
        }
        for(Pair p: map.keySet()){
            out.println(p.x+" "+p.y+" "+map.get(p));
        }
        out.flush();
    }
    static class Pair implements Comparable<Pair>{
        int x,y;
        Pair(int xp, int yp){
            x = xp;
            y = yp;
        }
        public int compareTo(Pair p){
            if(x != p.x)
                return x-p.x;
            return y-p.y;
        }
		public boolean equals(Object obj){			
			if(obj ==  null){
				return false;
			}
			if(!(obj instanceof Pair)){
				return false;
			}
			Pair p = (Pair) obj;
			return this.x == p.x && this.y == p.y;
        }
		public int hashCode() {
			int hash = new Integer(x).hashCode();
			hash = hash*31 + new Integer(x).hashCode();
			return hash;
		}
    }
}
