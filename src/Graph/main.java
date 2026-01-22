package Graph;

public class main {
    public static void main(String[] args) {
        AdjacencyList adjlist=new AdjacencyList(3);
        adjlist.addedges(0,2);
        adjlist.addedges(1,0);
        adjlist.addedges(2,1);
        adjlist.display();


    }
}
