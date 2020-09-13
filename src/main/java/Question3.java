import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author jamin
 * @date 2020/9/10
 */
public class Question3 {

    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println("[length] = " + lengthOfLongestSubstring(str));
    }

    // 滑动窗口，计算每个字符第二次出现的长度
    // 存储 map 集合中
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < s.length(); end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }
}
