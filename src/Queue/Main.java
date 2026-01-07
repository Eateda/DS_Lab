package Queue;

public class Main {
    public static void main(String[] args) {
        SLinkedQueue<String> lqueue=new SLinkedQueue<String>();
        ArrayQueue<String> aqueue=new ArrayQueue<String>();
        aqueue.enqueue("Ali");
        aqueue.enqueue("Saleh");
        aqueue.enqueue("Mohammed");
        aqueue.enqueue("musleh");

        System.out.println("the front element is: "+aqueue.front());
        aqueue.display();

//    while (!aqueue.isEmpty()){
//        System.out.println("element removed: "+aqueue.dequeue());
//    }

    }
}
