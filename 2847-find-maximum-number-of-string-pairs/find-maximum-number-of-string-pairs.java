class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println((char)words[j].charAt(1) +""+ (char)words[j].charAt(0));
                if(words[i].equals(words[j].charAt(1) +""+ words[j].charAt(0))) ans++;
            }
        }
        return ans;
    }
}