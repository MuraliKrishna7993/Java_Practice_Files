package Task2.SessionPractice;

public class DdlDemo {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    Node head;


    public void addFront(int new_data) {


        Node new_Node = new Node(new_data);
        new_Node.prev = null;
        new_Node.next = head;

        if (head != null)
            head.prev = new_Node;
        head = new_Node;
    }


    void addLast(int new_data) {

        Node new_node = new Node(new_data);

        Node last = head;


        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (last.next != null)
            last = last.next;


        last.next = new_node;

        new_node.prev = last;
    }


    public void InsertBefore(Node next_node, int new_data) {

        if (next_node == null) {
            System.out.println("The given next node can not be NULL");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.prev = next_node.prev;
        next_node.prev = new_node;
        new_node.next = next_node;
        if (new_node.prev != null)
            new_node.prev.next = new_node;
        else
            head = new_node;
    }


    public void InsertAfter(Node prev_Node, int new_data) {

        if (prev_Node == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }

    void deleteNode(Node del) {


        if (head == null || del == null) {
            return;
        }


        if (head == del) {
            head = del.next;
        }


        if (del.next != null) {
            del.next.prev = del.prev;
        }

        if (del.prev != null) {
            del.prev.next = del.next;
        }


        return;
    }


    public void Display(Node node) {
        Node last = null;
        System.out.println("Elements of Double Linked List are:");
        while (node != null) {
            System.out.println(node.data + " ");
            last = node;
            node = node.next;
        }
    }


    public static void main(String[] args) {

        DdlDemo obj = new DdlDemo();

        obj.addFront(107);        //150 107
        obj.addFront(150);
        obj.addLast(600);        // 150 107 600
        obj.addLast(42);         // 150 107 600 42
        obj.InsertAfter(obj.head.next, 81);  //  150 107 81 600 42
        obj.InsertBefore(obj.head.next.next, 52);  //150 107 52 81 600 42

        obj.Display(obj.head);


        obj.deleteNode(obj.head.next);

        System.out.println();

        System.out.println("List after deleting first node: ");
        obj.Display(obj.head);
    }
}



