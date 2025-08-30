class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char arr[] = answerKey.toCharArray();
        int ans1 = helper(arr,k,'F');
        int ans2 = helper(arr,k,'T');
        return Math.max(ans1,ans2);
    }
    public int helper(char []arr,int k,char ch){
        int n = arr.length;
        int i=0,j=0;
        int cnt=0;
        int ans = 0;
        while(j<n){
            if(arr[j] == ch) cnt++;
            while(cnt>k){
                if(arr[i] == ch){
                    cnt--;
                }
                i++;
            }
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}