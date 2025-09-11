class Solution {
    public long smallestNumber(long num) {
        if(num>0 && num<9) return num;
        if(num>0){
            String str = String.valueOf(num);
            char []arr = str.toCharArray();
            Arrays.sort(arr);
            String temp1 = new String(arr);
            int idx = temp1.lastIndexOf('0');
            System.out.println(idx);
            for(char c : arr) System.out.print(c+" ");
            if(idx !=-1){
                char temp = arr[0];
                arr[0] = arr[idx+1];
                arr[idx+1] = temp;
            }
            String ans2 = new String(arr);
            return Long.parseLong(ans2);
        }
        String str = String.valueOf(num * -1);
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String ans = new String(arr);
        long res = Long.parseLong(ans);
        return res * -1;
    }
}