/*
Problem name: 860. Lemonade Change
Problem link: https://leetcode.com/problems/lemonade-change/
*/

class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        bool change = true;
        int arr[2]={0};   // 0 represents 5Rs note; 1 - 10 Rs; 2 - 15Rs.
        for(int i=0;i<bills.size();++i){
            if(bills[i] == 5)
                arr[0]++;
            
            else if(bills[i] == 10)
                if(arr[0]>0){
                    arr[0]--;
                    arr[1]++;
                }
                else{
                    change = false;
                    break;
                }
            
            else
                if(arr[1]>0 && arr[0]>0){
                    arr[1]--;
                    arr[0]--;
                }
                else if(arr[0] > 2){
                    arr[0]--;
                    arr[0]--;
                    arr[0]--;
                }
                else{
                    change = false;
                    break;
                }
        }
        
        if(change)  cout<<"true";
        else    cout<<"false";
        
        return change;
    }
};
