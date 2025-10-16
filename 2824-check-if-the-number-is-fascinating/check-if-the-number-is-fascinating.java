class Solution {
    public boolean isFascinating(int n) {
       String s="";
       s=s+Integer.toString(n);
       s=s+Integer.toString(2*n);
       s=s+Integer.toString(3*n);
    String temp="0";
    if(s.contains(temp)){
        return false;
    }
    char []array=s.toCharArray();
    for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]==array[j]){
                return false;
            }
        }
    }
    return true;
    }
}