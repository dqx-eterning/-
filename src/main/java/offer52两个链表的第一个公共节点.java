public class offer52两个链表的第一个公共节点 {
    public static void main(String[] args) {
        ListNode commons = new ListNode(8);
        commons.next= new ListNode(4);
        commons.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = commons;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = commons;
        ListNode res = getIntersectionNode(headA, headB);
        System.out.println(res.val);

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        //计算俩个链表长度
        ListNode whereA = headA;
        ListNode whereB = headB;
        int lenA = 0;
        int lenB = 0;
        while (whereA != null) {
            lenA++;
            whereA = whereA.next;
        }
        while (whereB != null) {
            lenB++;
            whereB = whereB.next;
        }
        //将指针移动到可能出现匹配的位置
        whereA = headA;
        whereB = headB;
        if (lenA >= lenB) {
            for (int val = lenA - lenB; val > 0; val--) {
                whereA = whereA.next;
            }
        } else {
            for (int val = lenB - lenA; val > 0; val--) {
                whereB = whereB.next;
            }
        }
        //一一进行匹配
        int min=Math.min(lenA,lenB);
        while (min--!=0){
            if(whereA==whereB)return whereA;
            whereA=whereA.next;
            whereB=whereB.next;
        }
        return null;
    }

   static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}


