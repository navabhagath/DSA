class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer>hs = new HashSet<>();
        List<Integer>al = new ArrayList<>();
        for(int num : nums){
            hs.add(num);
        }
        for(int num : hs) al.add(num);
        Collections.sort(al);
        System.out.println(al);
        int max = 0;
        int cnt = 1;
        for(int i=1;i<al.size();i++){
            if(al.get(i) - al.get(i-1) == 1){
                cnt++;
            }else{
                max = Math.max(cnt,max);
                cnt = 1;
            }
        }
        max = Math.max(cnt,max);
        return max;

    }
}