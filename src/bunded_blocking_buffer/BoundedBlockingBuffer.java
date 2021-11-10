package bunded_blocking_buffer;

public class BoundedBlockingBuffer<T> {
    private T data;
    

    public synchronized void put(T date) throws InterruptedException {
       if (this.data != null) {
            wait();
        }
        this.data = date;
        notify();
    }

    public synchronized T take() throws InterruptedException {
        if (data == null) {
            wait();
        }
        T getData = data;
        data = null;
        notify();
        return getData;
    }

}
