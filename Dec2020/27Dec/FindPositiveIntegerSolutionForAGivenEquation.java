/*
Problem Name: 1237. Find Positive Integer Solution for a Given Equation
Problem Link: https://leetcode.com/problems/find-positive-integer-solution-for-a-given-equation/
*/

/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=1;i<=1000;i++){
            int l = 1, r = 1000;
            while(l<=r){
                int mid = l + (r-l)/2, val = customfunction.f(i,mid);
                if(val == z){
                    List<Integer> t = new ArrayList<Integer>();
                    t.add(i);
                    t.add(mid);
                    list.add(t);
                    break;
                }
                else if(z < val)
                    r = mid - 1;
                else
                    l = mid + 1;
            }
        }
        return list;
    }
}
