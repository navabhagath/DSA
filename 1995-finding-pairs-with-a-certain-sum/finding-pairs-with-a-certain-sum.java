class FindSumPairs {
    int[] nums1;
    int[] nums2;
    Map<Integer,Integer>mp = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for(int num : nums2){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        mp.put(nums2[index],mp.get(nums2[index])-1);
        nums2[index]+=val;
        mp.put(nums2[index],mp.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) {
        int cnt=0;
        for(int i=0;i<nums1.length;i++){
            if(mp.containsKey(tot - nums1[i])){
                cnt+=mp.get(tot - nums1[i]);
            }
        }
        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */