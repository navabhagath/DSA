class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        List<String>al = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if((num.charAt(i) == num.charAt(i+1)) && (num.charAt(i) == num.charAt(i+2))){
                String str = num.substring(i,i+3);
                al.add(str);
            }
        }
        Collections.sort(al);
        if(al.size() == 0){
            return "";
        }
        return al.get(al.size()-1);
    }
}