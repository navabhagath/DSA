class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans=0,temp=0,sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            temp+=i;
            if(sum==temp) ans++;
        }
        return ans;
    }
}