package src.main.java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_2Sum_Problem {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums,target);
        if(result!=null){
            System.out.println("Indices : [ " + result[0] + "," + result[1] +"]" );
        }else {
            System.out.println("No solution found ");
        }


        System.out.println(result[1]);

    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int compliment = target-nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i],i);
        }
        return null;

    }
}
