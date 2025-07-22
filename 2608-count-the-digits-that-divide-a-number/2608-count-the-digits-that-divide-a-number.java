class Solution {
    public int countDigits(int num)
    {
        int count=0;
        int n=num;
        while(n>0){
            int x=n%10;
            if(num%x==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}