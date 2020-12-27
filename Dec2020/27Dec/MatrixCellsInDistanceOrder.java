/*
Problem Name: 1030. Matrix Cells in Distance Order
Problem Link: https://leetcode.com/problems/matrix-cells-in-distance-order/
*/
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<Cells> list = new ArrayList<Cells>();
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                list.add(new Cells(i,j,r0,c0));
            }
        }
        Collections.sort(list);
        int ans[][] = new int[list.size()][2];
        for(int i=0;i<ans.length;i++){
            ans[i][0] = list.get(i).x;
            ans[i][1] = list.get(i).y;
        }
        return ans;
    }
    static class Cells implements Comparable<Cells>{
        int x,y,d;
        Cells(int xp, int yp, int bx, int by){
            x = xp;
            y = yp;
            d = Math.abs(x - bx) + Math.abs(y - by);
        }
        public int compareTo(Cells c){
            return d - c.d;
        }
    }
}
