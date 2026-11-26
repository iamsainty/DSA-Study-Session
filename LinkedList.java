public class LinkedList {

    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public class DoublyNode{
        int data;
        DoublyNode prev;
        DoublyNode next;

        public DoublyNode(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }



    public static void main(String[] args) {

        LinkedList.Node head = null;

        head = new LinkedList().new Node(1);

        Node newNode = new LinkedList().new Node(2);

        head.next = newNode;







    }
}
