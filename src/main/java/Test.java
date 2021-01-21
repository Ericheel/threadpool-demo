import tool.Task;
import tool.ThreadPoolManager;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = ThreadPoolManager.getInstance();
        IntStream.rangeClosed(1, 15).forEach(e -> threadPoolExecutor.execute(new Task()));
        System.out.println(threadPoolExecutor.getQueue().size());
    }
}
