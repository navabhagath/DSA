class Solution {
public:
    int maxFreqSum(string s) {
        int n = s.size();
        map<int,int>mp1;
        map<int,int>mp2;    
        for(int i=0;i<n;i++){
            char ch = s[i];
            if(isVowel(ch)){
                mp1[ch]++;
            }else{
                mp2[ch]++;
            }
        }
        int max1 = 0;
        int max2 = 0;
        for(auto &it : mp1){
            max1 = max(max1,it.second);
        }
        for(auto &it : mp2){
            max2 = max(max2,it.second);
        }
        return max1 + max2;
    }
    bool isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u';
    }
};