class Solution {
    public String helper(String str){
        String temp = str.toLowerCase();
        StringBuilder sb = new StringBuilder(temp);
        for(int i=0;i<str.length();i++){
            char c = temp.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                sb.setCharAt(i,'*');
            }
        }
        return sb.toString();
    }
    public String[] spellchecker(String[] word, String[] q) {
        Set<String>hs = new HashSet<>();
        Map<String,String>mp1 = new HashMap<>();
        Map<String,String>mp2 = new HashMap<>();
        for(String w : word){
            hs.add(w);
            String str1  = w.toLowerCase();
            System.out.println(1+" " +str1);
            mp1.putIfAbsent(str1,w);
            String str2 = helper(w);
            System.out.println(1+" " +str2);
            mp2.putIfAbsent(str2,w);
        }
        int n = q.length;
        String ans[] = new String[n];
        for(int i=0;i<n;i++){
            String curr = q[i];
            if(hs.contains(curr)){
                ans[i] = curr;
            }else if(mp1.containsKey(curr.toLowerCase())){
                System.out.println(2+" " +curr.toLowerCase());
                ans[i] = mp1.get(curr.toLowerCase());
            }else if(mp2.containsKey(helper(curr))){
                System.out.println(2+" " +helper(curr));
                ans[i] = mp2.get(helper(curr));
            }else{
                ans[i] = "";
            }
        }
        return ans;
    }
}