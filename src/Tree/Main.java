package Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree btree=new BinaryTree(10);

        btree.insertNoda(12);
        btree.insertNoda(8);
        btree.insertNoda(14);
        btree.insertNoda(2);
        System.out.println(btree.searchNode(8));
        btree.preOrder();
    }
}
