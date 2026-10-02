class Solution {
    public int[] evenOddBit(int n) {
        int i = 0;
        int[] ret = {0, 0};
        while(n > 0){
            if(n % 2 == 1){
                if(i % 2 == 0){
                    ret[0]++;
                }
                else{
                    ret[1]++;
                }
            }

            i++;
            n /= 2;
        }

        return ret; 
    }
}
