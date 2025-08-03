class Solution {
    public List<String> commonChars(String[] words) {
        int []frq = new int[26];
        Arrays.fill(frq,Integer.MAX_VALUE);
        List<String>res = new ArrayList<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            int []temp = new int[26];
            String curr = words[i];
            for(char ch : curr.toCharArray()){
                temp[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                frq[j] = Math.min(frq[j],temp[j]);
            }
        }
        for(int i=0;i<26;i++){
            while(frq[i] > 0){
                res.add(Character.toString( (char)(i+'a') ));
                frq[i]--;
            }
        }
        return res;
    }
}