class Solution {
    public boolean canAliceWin(int[] nums)
    {
        int SD=0;
        int DD=0;
        for(int n:nums){
            if(n<10){
                SD=SD+n;
            }
            else{
                DD=DD+n;
            }
        }
        if(SD==DD){
            return false;
            }
        else{
            return true;
            }

    }
}