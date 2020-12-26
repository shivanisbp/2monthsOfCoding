/*
Problem name: 811. Subdomain Visit Count
Problem link: https://leetcode.com/problems/subdomain-visit-count/
*/

class Solution {
public:
    vector<string> subdomainVisits(vector<string>& cpdomains) {
        map<string, int> map;
        for (auto cd : cpdomains) {
            int space = cd.find(" ");
            int num = stoi(cd.substr (0, space));
            string s = cd.substr(space + 1);
            for (int i=0;i<s.size();++i)
                if (s[i] == '.')
                    map[s.substr(i+1)] += num;
            map[s] += num;
        }
        vector<string> res;
        for (auto k : map)
            res.push_back (to_string(k.second) + " " + k.first);
        return res;
    }
};
