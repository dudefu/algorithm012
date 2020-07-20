package Week_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 前 K 个高频元素
 */
public class TopKFrequentDemo {
    
    public static void main(String[] args) {
        
        int[] nums = {1,1,1,2,2,3};
        int k = 2 ;
        List<Integer> result = topKFrequent(nums, k);
        System.out.println(Arrays.toString(result.toArray()));;

    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
    	// 先将元素对应的数量存入Map中
        HashMap<Integer, Integer> elementNum = new HashMap<Integer, Integer>();
        for(int element: nums){
            elementNum.put(element, elementNum.getOrDefault(element, 0) + 1);
        }
        
		// 以元素数量为索引，将元素存入桶数组
        List<Integer>[] bucket = new List[nums.length+1];
        for(int element: elementNum.keySet()){
            int num = elementNum.get(element);
            if(bucket[num] == null){
                bucket[num] = new ArrayList<>();
            }
            bucket[num].add(element);
        }
		
		// 倒序遍历桶数组
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = bucket.length - 1; i > 0 && ans.size() < k; i--){
            if(bucket[i] != null) ans.addAll(bucket[i]);
        }

        return ans;
    }
}