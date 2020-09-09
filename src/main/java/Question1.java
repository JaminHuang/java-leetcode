import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author jamin
 * @date 2020/9/9
 */
public class Question1 {

    public static void main(String[] args) throws Exception {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        System.out.println("[data] = " + Arrays.toString(twoSumAnswer(nums, target)));
    }

    // 方法一，暴力遍历 复杂度O(n2)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Objects.equals((nums[i] + nums[j]), target)) {
                    return new int[] {i, j};
                }
            }
        }

        return null;
    }

    // 最优方法:哈希算法
    // 由于哈希查找的时间复杂度为 O(1)，所以可以利用哈希容器 map 降低时间复杂度
    public static int[] twoSumAnswer(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
