class Solution {

    public long function(int[] piles, int speed){
        long hour = 0;
        for(int i = 0; i < piles.length; i++){
            hour = hour + piles[i] / speed;

        if(piles[i] % speed != 0)
            hour++;
        }
        return hour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int i = 0; i< piles.length; i++){
            high = Math.max(high, piles[i]);
        }
        int res = -1;

        while (low <= high) {
            int guss = (low + high) / 2;

            long hour = function(piles, guss);

            if (hour > h) {
                low = guss + 1;
            } else {
                res = guss;
                high = guss - 1;
            }
        }
        return res;
    }

}