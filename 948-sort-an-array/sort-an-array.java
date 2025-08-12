class Solution {
    public int[] sortArray(int[] nums) {
        qs(nums,0,nums.length-1);
        return nums;
    }
    public void qs(int []nums,int low,int high){
        if(low < high){
            int pidx = helper(nums,low,high);
            qs(nums,low,pidx-1);
            qs(nums,pidx+1,high);
        }
    }
    public int helper(int []nums,int low,int high){
        int randomIndex = low + (int)(Math.random() * (high - low + 1));
        swap(nums, low, randomIndex);
        int pivot = nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(nums[i] <= pivot && i<=high-1){
                i++;
            }
            while(nums[j] > pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(nums,i,j);
            }
        }
        swap(nums,low,j);
        return j;
    }
    public void swap(int []arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}