import com.model.ListNode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author jamin
 * @date 2020/9/10
 */
public class Question2 {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int nextSum = 0; //进位值
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + nextSum;
            nextSum = sum / 10;
            sum = sum % 10;
            temp.next = new ListNode(sum);
            temp = temp.next;

            if (l1 != null) {
                l1 =l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if(nextSum == 1) temp.next = new ListNode(nextSum);

        return result.next;
    }
}
