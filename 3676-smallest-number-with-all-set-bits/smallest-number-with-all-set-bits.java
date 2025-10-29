class Solution {
    public int smallestNumber(int n) {
        String str = Integer.toBinaryString(n);
        int len = str.length();
        char []arr = new char[len];
        Arrays.fill(arr,'1');
        String s = new String(arr);
        System.out.println(s);
        System.out.println(Integer.parseInt(s,2));
        return Integer.parseInt(s,2);
    }
}