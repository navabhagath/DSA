class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int len = n+k-1;
        int[] temp=new int[len];
        for(int i=0;i<n;i++){
            temp[i]=colors[i];
        }
        for(int i=0;i<k-1;i++){
            temp[n+i] = colors[i];
        }
        int i=0,j=1;
        int ans=0;
        while(j<len){
            if(temp[j]==temp[j-1]){
                i=j;
                j++;
                continue;
            }
            j++;
            if(j-i < k) continue;
            ans++;
            i++;
        }
        return ans;
    }
}