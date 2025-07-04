class Solution {
    public char kthCharacter(long k, int[] operations) {
        long val = k;
        int op=0;
        char curr = 'a';
        while(val > 1){
            int j = (int) Math.ceil ( Math.log(val) / Math.log(2) );
            val -= Math.pow(2,j-1);
            op+= operations[j-1];
        }
        System.out.println(op);
        return (char) ((op % 26 ) + 'a'); // (((curr - 'a' + op )%26)+'a');
    }
}