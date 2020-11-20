/*
Problem name: Baseball Game
Problem link: https://leetcode.com/problems/baseball-game/
*/

class Solution {
public:
    int calPoints(vector<string>& ops) {
        int sum=0,i=0,t1=0,t2=0;
        stack<int> record;
        
        while(i<ops.size()){
            if(ops[i]=="+"){
                t1=record.top();
                record.pop();
                t2=record.top();
                record.push(t1);                
                record.push(t1+t2);
                sum+=t1+t2;
            }
            else if(ops[i]=="D"){
                sum+=2*record.top();
                record.push(2*record.top());
                
            }
            else if(ops[i]=="C"){
                sum-=record.top();
                record.pop();
            }
            else{
                record.push(stoi(ops[i]));
                sum+=stoi(ops[i]);
            }
            i++;
        }
        return sum;
        
    }
};
