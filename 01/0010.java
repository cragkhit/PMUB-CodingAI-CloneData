public static ListNode bubbleSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        boolean swapped;
        do {
            swapped = false;
            ListNode current = head;
            ListNode prev = null;
            while (current != null && current.next != null) {
                if (current.val > current.next.val) {
                    if (prev == null) {
                        head = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    ListNode temp = current.next.next;
                    current.next.next = current;
                    current.next = temp;
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        } while (swapped);

        return head;
    }