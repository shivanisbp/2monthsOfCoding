/*
Problem name: 690. Employee Importance
Problem link: https://leetcode.com/problems/employee-importance/
*/

/*
// Definition for Employee.
class Employee {
public:
    int id;
    int importance;
    vector<int> subordinates;
};
*/

class Solution {
public:
    int getImportance(vector<Employee*> employees, int id) {
        map<int, Employee*> emp;
        int result = 0;
        
        for(int i=0; i<employees.size(); i++)
            emp[employees[i]->id] = employees[i];
        
        queue<int> q;
        q.push(emp[id]->id);
        while(!q.empty()){
            
            int parent = q.front();
            q.pop();
            result += emp[parent]->importance;
            for(int i=0; i<emp[parent]->subordinates.size(); i++){
                q.push(emp[parent]->subordinates[i]);
            }
        }
    
        return result;
    }
};
