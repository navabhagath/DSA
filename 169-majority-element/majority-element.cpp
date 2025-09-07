class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int,int>mpp;
        for(int num : nums){
            mpp[num]++;
        }
        int n = nums.size();
        for(auto it : mpp){
            int key = it.first;
            int val = it.second;
            if(val > n/2){
                return key;
            }
        }
        return -1;
    }
};