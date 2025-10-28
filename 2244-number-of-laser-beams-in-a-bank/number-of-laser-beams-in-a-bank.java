class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer>al = new ArrayList<>();
        int n = bank.length;
        for(int i=0;i<n;i++){
            int cnt = 0;
            String str = bank[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == '1'){
                    cnt++;
                }
            }
            if(cnt != 0){
                al.add(cnt);
            }
        }
        if(al.size() == 0){
            return 0;
        }
        int ans = 0;
        for(int i=0;i<al.size()-1;i++){
            ans += al.get(i) * al.get(i+1);
        }
        return ans;
    }
}