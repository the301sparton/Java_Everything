public class LinkedList {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);

        printList(linkedList.head);
    }

    private static void printList(Node ptr) {
        if(ptr==null) {
            return;
        }
        else {
            System.out.print(ptr.data+"\t");
            printList(ptr.next);
        }
    }
}
