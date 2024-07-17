class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {     
        Collections.sort(a);        
        long minDiff = Long.MAX_VALUE;       
        for (int i = 0; i <= n - m; i++) {
            long diff = a.get(i + m - 1) - a.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }
}
