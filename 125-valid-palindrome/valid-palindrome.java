class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        for(char ch : s.toCharArray()){
            if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                sb1.append(Character.toLowerCase(ch));
            }
            if(ch>='0' && ch<='9'  ){
                sb1.append(ch);
            }
        }
        String str1 = sb1.toString();
        System.out.println(str1);
        StringBuilder sb2 = new StringBuilder(str1).reverse();
        String str2 = sb2.toString();
         System.out.println(str1);
        return str1.equals(str2);
    }
}