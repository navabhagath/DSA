import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        ArrayList<String> ans = new ArrayList<>();

        String start = folder[0];
        ans.add(start);
        
        for (int i = 1; i < folder.length; i++) {
            String a = folder[i];
            int Idx = start.length();
            
            if (a.startsWith(start) && a.charAt(Idx)=='/') {
                continue;
            } else {
                start = a;
                ans.add(a);
            }
        }
        return ans;
    }
}