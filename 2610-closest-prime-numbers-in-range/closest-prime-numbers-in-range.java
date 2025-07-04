class Solution {
    public List<Integer> sieve(int n){
        boolean []isprime = new boolean[n];
        Arrays.fill(isprime,true);
        isprime[0] = false;
        isprime[1] = false;
        for(int i=2;i<n;i++){
            if(isprime[i]){
                for(int j=2*i;j<n;j+=i){
                    isprime[j] = false;
                }
            }
        }
        List<Integer>primes = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isprime[i]){
                primes.add(i);
            }
        }
        return primes;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer>primes = sieve(right+1);
        List<Integer>rangePrimes = new ArrayList<>();
        for(int num : primes) {
            if(num >= left){
                rangePrimes.add(num);
            }
        }
        if(rangePrimes.size() == 0 || rangePrimes.size()==1){
            return new int[]{-1,-1};
        }

        System.out.println(rangePrimes);

        int first=0;
        int second=0;
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<rangePrimes.size()-1;i++){
            int currDiff = rangePrimes.get(i+1) - rangePrimes.get(i);
            if(currDiff < diff){
                first = rangePrimes.get(i);
                second = rangePrimes.get(i+1);
                diff = currDiff;
            }
        }
        return new int[]{first,second};
    }
}