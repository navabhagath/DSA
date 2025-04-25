class Solution {
public:
    long long countInterestingSubarrays(vector<int>& nums, int m, int k) {
        
        unordered_map<int,int>mpp;
        int n=nums.size();
        int sum=0;
        long long result=0;
        mpp[0]=1;
        for(int i=0;i<n;i++){
            if(nums[i]%m==k){
                sum+=1;
            }
            int r1=sum%m;
            int r2=(r1-k+m)%m;
            result+=mpp[r2];
            mpp[r1]++;
        }
        return result;
    }
};