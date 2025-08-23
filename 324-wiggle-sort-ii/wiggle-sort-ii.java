class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        List<Integer>al1 = new ArrayList<>();
        List<Integer>al2 = new ArrayList<>();
        int n = nums.length;
        int idx = 0;
        if(n%2 == 0){
            idx = n/2;
        }else{
            idx = (n/2) + 1;
        }
        for(int i=0;i<idx;i++){
            al1.add(nums[i]);
        }
        for(int i=idx;i<n;i++){
            al2.add(nums[i]);
        }
        System.out.println(al1);
        System.out.println(al2);
        int x=al1.size()-1;
        int y=al2.size()-1;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                nums[i] = al1.get(x);
                x--;
            }else{
                nums[i] = al2.get(y);
                y--;
            }
        }
    }
}