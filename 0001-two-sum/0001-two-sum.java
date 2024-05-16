class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(nums[i])){
                arr[0] = i;
                arr[1] = m.get(nums[i]);
            }else{
                int value = target - nums[i];
                m.put(value, i);
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}