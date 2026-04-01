class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i:nums){
            if(even(i)){ count++; }
        }
        return count;
    }
    static boolean even(int nums){
        int numberOfDigits=digits(nums);
        return numberOfDigits % 2 == 0;
    }
    static int digits(int num){
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = num * -1;
        }
        int count = 0;
         while (num > 0){
             count++;
             num = num/10;
         }
         return count;
    }
}