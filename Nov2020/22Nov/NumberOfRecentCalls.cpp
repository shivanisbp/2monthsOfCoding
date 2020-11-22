/*
Problem name: 933. Number of Recent Calls
Problem link: https://leetcode.com/problems/number-of-recent-calls/
*/

class RecentCounter {
public:
    int counter;
    queue<int>requests;
    RecentCounter() {
        counter=0;
    }
    
    int ping(int t) {
        requests.push(t);
        counter++;
        while(requests.front()<t-3000){
            requests.pop();
            counter--;
        }
        return counter;
    }
};

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter* obj = new RecentCounter();
 * int param_1 = obj->ping(t);
 */
