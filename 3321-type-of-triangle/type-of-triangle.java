class Solution {
    public boolean isValid(int a,int b,int c){
        return a+b>c && b+c>a && a+c>b; 
    }
    public String triangleType(int[] nums) {
        if(!isValid(nums[0],nums[1],nums[2])){
            return "none";
        }
        Set<Integer>hs=new HashSet<>();
        for(int num : nums) hs.add(num);
        int n = hs.size();
        return n==1?"equilateral":n==2?"isosceles":"scalene";
    }
}