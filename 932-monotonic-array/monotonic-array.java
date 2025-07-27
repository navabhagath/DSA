class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        ArrayList<Integer>al = new ArrayList<>();
        al.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i] != al.get(al.size()-1)){
                al.add(nums[i]);
            }
        }
        ArrayList<Integer>temp1 = new ArrayList<>(al);
        ArrayList<Integer>temp2 = new ArrayList<>(al);
        Collections.sort(temp1);
        Collections.sort(temp2,Collections.reverseOrder());
        return al.equals(temp1) || al.equals(temp2);
    }
}