class Solution {
    public boolean areNumbersAscending(String s) {
        String[] parts = s.split("\\s+");
        List<Integer>al=new ArrayList<>();
        for(int i=0;i<parts.length;i++){
            String curr = parts[i];
            if(Character.isDigit(curr.charAt(0))){
                al.add(Integer.parseInt(curr));
            }
        }
        for(int num : al) System.out.print(num+" ");
        if(al.size()==1){
            return true;
        }
        for(int i=1;i<al.size();i++){
            if(al.get(i) <= al.get(i-1)){
                return false;
            }
        }
        return true;
    }
}