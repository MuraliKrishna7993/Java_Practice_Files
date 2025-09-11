package Task2.SessionPractice;

public class DllDemo {

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;
    }

    private ListNode head;
    private ListNode tail;
    private int length;


    public DllDemo() {

        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode();
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;

    }

    public void show() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DllDemo dll = new DllDemo();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.show();


    }
}

