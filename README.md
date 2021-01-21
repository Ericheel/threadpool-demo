# threadpool-demo
一种弹性线程池的实现demo


当线程池的核心线程数满负荷后，队列默认拒绝threadpool向队列中添加任务，从而激活threadpool最大线程数工作。当最大线程数满负荷后，在拒绝策略中手动将任务入队。
