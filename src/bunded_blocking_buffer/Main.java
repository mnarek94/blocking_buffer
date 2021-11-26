package bunded_blocking_buffer;

public class Main {
    private static final BoundedBlockingBuffer<Integer> boundedBlockingBuffer = new BoundedBlockingBuffer<>();

    public static void main(String[] args) {
        ImplementerTreadPut implementerTreadPut = new ImplementerTreadPut(boundedBlockingBuffer);
        ImplementerTreadTake implementerTreadTake = new ImplementerTreadTake(boundedBlockingBuffer);
        Thread thread = new Thread(implementerTreadPut);
        Thread thread1 = new Thread(implementerTreadTake);

        thread1.start();
        thread.start();

    }
}
