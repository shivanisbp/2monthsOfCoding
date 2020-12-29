/*
Problem Name: 937. Reorder Data in Log Files
Problem Link: https://leetcode.com/problems/reorder-data-in-log-files/
*/
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> list = new ArrayList<String>();
        for(String s:logs)
            list.add(s);
        Collections.sort(list, new Comp());
        for(int i=0;i<logs.length;i++)
            logs[i] = list.get(i);
        return logs;
    }
    class Comp implements Comparator<String>{
        public int compare(String s1, String s2){
            String s1arr[] = s1.split(" ",2), s2arr[] = s2.split(" ",2);
            if(Character.isDigit(s1arr[1].charAt(0)) && Character.isDigit(s2arr[1].charAt(0)))
                return 0;
            else if(Character.isDigit(s1arr[1].charAt(0)))
                return 1;
            else if(Character.isDigit(s2arr[1].charAt(0)))
                return -1;
            else if(s1arr[1].equals(s2arr[1]))
                return s1arr[0].compareTo(s2arr[0]);
            return s1arr[1].compareTo(s2arr[1]);
        }
    }
}
