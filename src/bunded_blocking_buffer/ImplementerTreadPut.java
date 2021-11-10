package bunded_blocking_buffer;

public class ImplementerTreadPut implements Runnable {
    private final BoundedBlockingBuffer<Integer> boundedBlockingBuffer;

    public ImplementerTreadPut(BoundedBlockingBuffer<Integer> boundedBlockingBuffer) {
        this.boundedBlockingBuffer = boundedBlockingBuffer;
    }

    @Override

    public void run() {
        try {

            boundedBlockingBuffer.put(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
