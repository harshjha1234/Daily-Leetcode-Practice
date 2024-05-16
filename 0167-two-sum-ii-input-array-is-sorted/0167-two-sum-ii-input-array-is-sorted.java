class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        int f = 0, sec = 0;
        while(s<e){
            int value = numbers[s]+numbers[e];
            if(value == target){
                f = s;
                sec = e;
                break;
            }else if(value < target){
                s++;
            }else{
                e--;
            }
        }
        return new int[]{f+1, sec+1};
    }
}