/*
Problem Name: 811. Subdomain Visit Count
Problem Link: https://leetcode.com/problems/subdomain-visit-count/
*/
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        int n = cpdomains.length;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String inp[] = cpdomains[i].split(" ");
            int cnt = Integer.parseInt(inp[0]);
            String domains[] = inp[1].split("\\.");
            String dom = "";
            for(int j=domains.length-1;j>=0;j--){
                dom = "." + domains[j] + dom;
                map.put(dom.substring(1), map.getOrDefault(dom.substring(1), 0) + cnt);
            }
        }
        List<String> ans = new ArrayList<String>();
        for(String key : map.keySet()){
            ans.add(map.get(key)+" "+key);
        }
        return ans;
    }
}
