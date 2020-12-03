/*
Problem Name: 690. Employee Importance
Problem Link: https://leetcode.com/problems/employee-importance/
*/

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Queue<Employee> q = new LinkedList<Employee>();
        int imp = 0;
        for(int i=0;i<employees.size();i++)
            if(employees.get(i).id == id){
                q.add(employees.get(i));
                break;
            }
        while(!q.isEmpty()){
            Employee emp = q.remove();
            imp += emp.importance;
            List<Integer> e = emp.subordinates;
            for(int i=0;i<e.size();i++){
                for(int j=0;j<employees.size();j++){
                    if(employees.get(j).id == e.get(i))
                        q.add(employees.get(j));
                }
            }
        }
        return imp;
    }
}
