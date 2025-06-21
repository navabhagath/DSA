class Solution {
    public int minimumDeletions(String word, int k) {
        int []frq = new int[26];
        for(char c : word.toCharArray()){
            frq[c-'a']++;
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(frq[i] > 0) cnt++;
        }
        int []temp = new int[cnt];
        int idx=0;
        for(int i=0;i<26;i++){
            if(frq[i]>0){
                temp[idx++] = frq[i];
            }
        }
        Arrays.sort(temp);
        for(int num : temp) System.out.print(num+" ");
        int ans = word.length();
        for(int i=0;i<cnt;i++){
            int del=0;
            for(int j=0;j<cnt;j++){
                int x = temp[i];
                int y = temp[j];
                if(x > y){
                    del+=y;
                }else if(y > x+k){
                    del+=y-(x+k);
                }
            }
            ans=Math.min(ans,del);
        }
        return ans;
    }
}