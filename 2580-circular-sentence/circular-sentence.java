class Solution {
    public boolean isCircularSentence(String sentence) {
        String []parts = sentence.split("\\s+");
        int n = parts.length;
        for(int i=0;i<n-1;i++){
            String cur = parts[i];
            String next = parts[i+1];
            if(cur.charAt(cur.length()-1) != next.charAt(0)){
                return false;
            }
        }
        String first = parts[0];
        String last = parts[n-1];
        if(first.charAt(0) != last.charAt(last.length()-1)){
            return false;
        }
        return true;
    }
}