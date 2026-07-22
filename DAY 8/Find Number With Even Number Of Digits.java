class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int c=0;
            int n=num;
            while(n>0){
                c++;
                n=n/10;
               
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
    }
}
