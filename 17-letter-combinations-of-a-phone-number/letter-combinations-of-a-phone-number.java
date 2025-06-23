class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
        if(digits.length() == 0){
            return res;
        }
        Map<Character,String>mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");

        StringBuilder sb = new StringBuilder();
        bactrack(digits,0,sb,mp,res);
        return res;
    }
    public void bactrack(String digits,int idx,StringBuilder sb,Map<Character,String>mp,List<String>res){
        if(idx >= digits.length()){
            res.add(sb.toString());
            return;
        }
        String curr = mp.get(digits.charAt(idx));
        for(char c : curr.toCharArray()){
            sb.append(c);
            bactrack(digits,idx+1,sb,mp,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}