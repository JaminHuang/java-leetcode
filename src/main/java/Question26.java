import java.util.Arrays;

/**
 * 力扣官网
 * 26. 删除排序数组中的重复项
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author jamin
 */
public class Question26 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);
        System.out.println("[nums.length] = " + length);
        System.out.println("[data] = " + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        if (nums.length < 2) {
            return nums.length;
        }

        while (true) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;

            if (j >= nums.length) {
                break;
            }
        }

        return i + 1;
    }
}
