package bunded_blocking_buffer;

public class ImplementerTreadTake implements Runnable {
    private final BoundedBlockingBuffer<Integer> boundedBlockingBuffer;

    public ImplementerTreadTake(BoundedBlockingBuffer<Integer> boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
    }

    @Override
    public void run() {
        try {
            System.out.println(boundedBlockingBuffer.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
