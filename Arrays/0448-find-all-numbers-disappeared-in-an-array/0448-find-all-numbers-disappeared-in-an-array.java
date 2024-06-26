class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){

            int idx=Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
            nums[idx]=-1 * nums[idx];
            }
        }

        List<Integer> lst=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(nums[i] >0){
                lst.add(i+1);
            }
        }

        return lst;
    }
}