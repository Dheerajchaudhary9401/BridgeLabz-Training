import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i : nums) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    List<Integer>[] l = new ArrayList[nums.length + 1];
    for (int i = 0; i < nums.length + 1; i++) {
      l[i] = new ArrayList<>();
    }
    for (Map.Entry<Integer, Integer> curr : map.entrySet()) {
      int element = curr.getKey();
      int freq = curr.getValue();
      l[freq].add(element);
    }
    int arr[] = new int[k];
    int j = 0;
    for (int i = nums.length; i >= 0; i--) {
      if (l[i].size() == 0)
        continue;
      for (int it : l[i]) {
        arr[j] = it;
        j++;
        if (j >= k)
          break;
      }
      if (j >= k)
        break;
    }
    return arr;
  }
}