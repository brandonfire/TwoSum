import java.util.HashMap;
public class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int x = 0;
        int y = 0;
        int i;
        int l = nums.length;
        Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(i = 0; i<l; i++){
            hmap.put(nums[i], i);
        }
        for(i = 0; i<l; i++){
            
                if(hmap.containsKey(target-nums[i]))
                {
                    
                    
                    y = hmap.get(target-nums[i]);
                    if(y == i)
                    {
                        continue;
                    }
                    
                    x = i;
                    break;
                }
            
        }
        int[] re = {x,y};
        return re;
    }
}