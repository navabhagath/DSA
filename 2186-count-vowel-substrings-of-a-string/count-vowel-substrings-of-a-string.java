class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int cnt=0;
        if(n<5) return 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String temp = word.substring(i,j+1);
                if(helper(temp)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public boolean helper(String str){
        if(str.length()<=4) return false;
        int a=0,e=0,i=0,o=0,u=0;
        int not = 0;
        for(char ch : str.toCharArray()){
            if(ch=='a') a++;
            else if(ch=='e') e++;
            else if(ch=='i') i++;
            else if(ch=='o') o++;
            else if(ch=='u') u++;
            else not++;
        }
        if(not>=1) return false;
        return a>=1 && e>=1 && i>=1 && o>=1 && u>=1;
    }
}