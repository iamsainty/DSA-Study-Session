public class Trees {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.left = node4;
        node1.right = node3;

        node4.left = node2;
        
        node3.left = node6;
        node3.right = node5;


        int target = 7;
        boolean isPresent = search(node1, target);


        if(isPresent){
            System.out.println("Node with value " + target + " exist in tree");
        }
        else{
            System.out.println("Node with value " + target + " does not exist in tree");
        }
    }

    public static boolean search(Node node, int target){
        
        if(node == null) return false;
        if(node.data == target) return true;

        return search(node.left, target) || search(node.right, target);
    }

    public static void preorder(Node node){
        
    }
}



// DFS, preorder, inorder, postorder


// preorder - ROOT, LEFT, RIGHT
// inorder - LEFT, ROOT, RIGHT
// postorder - LEFT, RIGHT, ROOT
