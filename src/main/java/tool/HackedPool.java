package tool;

import java.util.concurrent.ArrayBlockingQueue;

public class HackedPool<E> extends ArrayBlockingQueue<E> {
    public HackedPool(int capacity) {
        super(capacity);
    }

    @Override
    public boolean offer(E e) {
        Task task = (Task) e;
        boolean flag = task.isFlag();
        if (flag) {
            super.offer(e);
            return true;
        }
        System.out.println("Reject...");
        return false;
    }
}
