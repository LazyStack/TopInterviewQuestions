class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        
        Set<List<Integer>> map = new HashSet<>();
        

        for(int i = 0 ; i < nums.length - 3 ; i++){
            for(int j = i+1 ; j < nums.length - 2 ; j++){
                //System.out.print(target - nums[i]);
                //int nTarget = target - nums[i] - nums[j];
                int low = j + 1 , high = nums.length - 1;
                while(low < high){
                   // System.out.println(nTarget - nums[high] + " " + nums[low]);
                    long sum1 = nums[low] + nums[high] ;
                    long sum2 = sum1 + nums[i];
                    long sum3 = sum2 + nums[j];
                    //System.out.print(sum3);
                    if(sum3 < target )
                        low++;
                    else if(sum3> target)
                        high--;
                    else{
                        List<Integer>output = new ArrayList<>();
                        output.add(nums[low]);
                        output.add(nums[i]);
                        output.add(nums[j]);
                        output.add(nums[high]);
                        map.add(output);
                        low++;
                        high--;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(map);
        return ans;

        
    }
    
}
