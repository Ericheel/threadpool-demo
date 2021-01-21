package tool;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolManager {

    private ThreadPoolManager() {
    }

    private static final ThreadPoolExecutor executor
            = new ThreadPoolExecutor(1, 10,
            5, TimeUnit.SECONDS, new HackedPool<>(500), new RejectPolicy());

    public static ThreadPoolExecutor getInstance() {
        return executor;
    }
}
