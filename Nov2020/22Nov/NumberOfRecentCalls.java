/*
Problem Name: 933. Number of Recent Calls
Problem Link: https://leetcode.com/problems/number-of-recent-calls/
*/
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        q.add(t);
        for(;q.size()>0 && q.peek()<t-3000;){
            q.remove();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
