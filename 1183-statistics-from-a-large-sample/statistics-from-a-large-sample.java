class Solution {
    public double[] sampleStats(int[] count) {
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<256;i++){
            if(count[i] > 0){
                mp.put(i,count[i]);
            }
        } 
        List<Double>ans = helper(mp);
        double median = med(mp);
        ans.add(3 , median);
        double []result= new double[5];
        for(int i=0;i<5;i++){
            result[i] = ans.get(i);
        }
        return result;
    }
    private List<Double> helper(Map<Integer,Integer>mp){
        List<Integer>keys = new ArrayList<>(mp.keySet());
        Collections.sort(keys);
        int c=0;
        long sum=0,length=0;
        int m=0;
        int mode=0;
        List<Double>res = new ArrayList<>();
        for(int i=0;i<keys.size();i++){
            if(i==0){
                res.add((double)keys.get(i));
            }
            if(i==keys.size()-1){
                res.add((double)keys.get(keys.size()-1));
            }
            if(m < mp.get(keys.get(i))){
                mode = keys.get(i);
                m = mp.get(keys.get(i));
            }
            sum += (long)keys.get(i) * mp.get(keys.get(i));
            length+= mp.get(keys.get(i));
        }
        res.add((double)sum / length);
        res.add((double)mode);

        return res;
    }
    private double med(Map<Integer,Integer>mp){
        int len = 0;
        for(int num : mp.values()){
            len += num;
        }
        List<Integer>keys = new ArrayList<>(mp.keySet());
        Collections.sort(keys);
        long []pre = new long[keys.size()];
        int idx = 0;
        Map<Integer,Long>hm = new HashMap<>();
        for(int i : keys){
            if(idx==0){
                pre[idx] = mp.get(i);
            }else{
                pre[idx] = pre[idx-1] + mp.get(i);
            }
            hm.put(i,pre[idx]);
            idx++;
        }
        double ans = 0;
        if(len % 2 !=0){
            long x = (len+1)/2;
            for(int i : keys){
                if(hm.get(i) >= x){
                    ans = i;
                    break;
                }
            }
        }else{
            long key1 = len / 2;
            long key2 = key1 + 1;
            Integer first = null, second = null;
            for (int i : keys) {
                if (first == null && hm.get(i) >= key1) {
                    first = i;
                }
                if (second == null && hm.get(i) >= key2) {
                    second = i;
                }
                if (first != null && second != null) break;
            }
            ans = (first + second) / 2.0;
        }
        return ans;
    } 
}