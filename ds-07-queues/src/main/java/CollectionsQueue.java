import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {
        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        System.out.println(mq.dequeue());//it will remove 1 and return 1
        System.out.println(mq.dequeue());

        //Collections Queue
        Queue<Integer> cq = new LinkedList<>();
        cq.add(1); //enqueue
        cq.add(3);
        System.out.println(cq.remove());//dequeue
        System.out.println(cq.remove());
    }

}
