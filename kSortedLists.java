import java.util.*;

// O (n logn n)

public class kSortedLists {
    public ListNode mergeKLists(List<ListNode> lists) {
        if (lists == null || list.size() == 0) {
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>() { // lists.size() decides the minimum capacity of the queue here.
            public int compare (ListNode o1, ListNode o2) { // for storing in low to high form.
                if (o1.val < o2.val) {
                    return -1;
                } else if (o1.val == o2.val) {
                    return 0
                } else {
                    return 1;
                }
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (ListNode node: lists) {
            if (node != null) {
                queue.add(node); // here we are only adding top node for each lists and that will be sorted as we have comparator.
            }
        }

        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null) { // traversing through k-lists and adding remaining item to the queue to get them sorted.
                queue.add(tail.next);
            }
        }
            return dummy.next;
        }
    }
}