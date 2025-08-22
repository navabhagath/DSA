class Solution {
    public String answerString(String word, int numFriends) {
        List<String>al = new ArrayList<>();
        int n = word.length();
        if(numFriends==1) {
            return word;
        }
        int len = n - numFriends + 1;
        String ans = "";
        for(int i=0;i<n;i++){
            int end = Math.min(i+len , n);
            String str = word.substring(i,end);
            if(ans.compareTo(str) <= 0){
                ans = str;
            }
        }
        // Collections.sort(al);
        // return al.get(al.size()-1);
        return ans;
    }
}