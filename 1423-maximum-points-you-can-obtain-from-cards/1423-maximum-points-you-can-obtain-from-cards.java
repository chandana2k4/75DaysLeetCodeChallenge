class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;

        int totalSum=0;
        for(int num:cardPoints) {
            totalSum+=num;
        }

        if(k==n) 
            return totalSum;
        

        int wSize=n-k;

        int wSum=0;

        for(int i=0;i<wSize;i++) {
            wSum+=cardPoints[i];

        }
        int minWin=wSum;


        for(int i=wSize;i<n;i++) {
            wSum+=cardPoints[i];
            wSum-=cardPoints[i-wSize];

            minWin=Math.min(minWin, wSum);
        }
        return totalSum-minWin;

    }
}