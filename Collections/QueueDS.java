package Collections;

// ============================================================
// MAIN CLASS
// ============================================================

public class QueueDS {

    public static void main(String[] args) {

        // 1. LINKED QUEUE
        System.out.println("===== LINKED QUEUE =====");

        Queue<Integer> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue(10);
        linkedQueue.enqueue(20);
        linkedQueue.enqueue(30);

        System.out.println("Queue: " + linkedQueue);
        System.out.println("Size: " + linkedQueue.size());
        System.out.println("Front element: " + linkedQueue.peek());

        System.out.println("Dequeued: " + linkedQueue.dequeue());
        System.out.println("Queue after dequeue: " + linkedQueue);

        linkedQueue.enqueue(40);

        System.out.println("After enqueue: " + linkedQueue);
        System.out.println("Is empty: " + linkedQueue.isEmpty());


        // 2. CIRCULAR ARRAY QUEUE
        System.out.println("\n===== CIRCULAR ARRAY QUEUE =====");

        Queue<Integer> arrayQueue = new CircularQueue<>(5);

        arrayQueue.enqueue(100);
        arrayQueue.enqueue(200);
        arrayQueue.enqueue(300);
        arrayQueue.enqueue(400);

        System.out.println("Queue: " + arrayQueue);

        System.out.println("Dequeued: " + arrayQueue.dequeue());
        System.out.println("Dequeued: " + arrayQueue.dequeue());

        arrayQueue.enqueue(500);
        arrayQueue.enqueue(600);
        arrayQueue.enqueue(700);

        System.out.println("After enqueue: " + arrayQueue);
        System.out.println("Front element: " + arrayQueue.peek());

        System.out.println("Dequeued: " + arrayQueue.dequeue());
        System.out.println("Final Queue: " + arrayQueue);

        System.out.println("Size: " + arrayQueue.size());
    }
}


// ============================================================
// QUEUE INTERFACE
// Defines the Queue ADT.
// ============================================================

interface Queue<T> {

    void enqueue(T value);

    T dequeue();

    T peek();

    int size();

    boolean isEmpty();

    void clear();
}


// ============================================================
// NODE
// Building block of our LinkedQueue.
// ============================================================

class QueueNode<T> {

    T data;
    QueueNode<T> next;

    QueueNode(T data) {
        this.data = data;
        this.next = null;
    }
}

// ============================================================
// LINKED QUEUE
// Internally uses nodes connected through references.
// ============================================================

class LinkedQueue<T> implements Queue<T> {

    private QueueNode<T> front;
    private QueueNode<T> rear;

    private int queueSize;

    LinkedQueue() {
        front = null;
        rear = null;
        queueSize = 0;
    }

    @Override
    public void enqueue(T value) {

        QueueNode<T> newNode = new QueueNode<>(value);

        if (rear == null) {

            front = newNode;
            rear = newNode;

        } else {

            rear.next = newNode;
            rear = newNode;
        }

        queueSize++;
    }

    @Override
    public T dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T value = front.data;

        front = front.next;

        queueSize--;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    @Override
    public T peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return front.data;
    }

    @Override
    public int size() {
        return queueSize;
    }

    @Override
    public boolean isEmpty() {
        return queueSize == 0;
    }

    @Override
    public void clear() {

        front = null;
        rear = null;
        queueSize = 0;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");

        QueueNode<T> current = front;

        while (current != null) {

            result.append(current.data);

            if (current.next != null) {
                result.append(", ");
            }

            current = current.next;
        }

        result.append("]");

        return result.toString();
    }
}


// ============================================================
// CIRCULAR QUEUE
// Internally uses a circular array.
// ============================================================

class CircularQueue<T> implements Queue<T> {

    private Object[] arr;

    private int front;
    private int rear;

    private int queueSize;
    private int capacity;

    CircularQueue() {
        this(5);
    }

    CircularQueue(int initialCapacity) {

        if (initialCapacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be greater than zero");
        }

        capacity = initialCapacity;

        arr = new Object[capacity];

        front = 0;
        rear = -1;

        queueSize = 0;
    }

    private void resize() {

        int newCapacity = capacity * 2;

        Object[] temp = new Object[newCapacity];

        for (int i = 0; i < queueSize; i++) {

            int index = (front + i) % capacity;

            temp[i] = arr[index];
        }

        arr = temp;

        capacity = newCapacity;

        front = 0;
        rear = queueSize - 1;
    }

    @Override
    public void enqueue(T value) {

        if (queueSize == capacity) {
            resize();
        }

        rear = (rear + 1) % capacity;

        arr[rear] = value;

        queueSize++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        T value = (T) arr[front];

        arr[front] = null;

        front = (front + 1) % capacity;

        queueSize--;

        if (queueSize == 0) {
            front = 0;
            rear = -1;
        }

        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return (T) arr[front];
    }

    @Override
    public int size() {
        return queueSize;
    }

    @Override
    public boolean isEmpty() {
        return queueSize == 0;
    }

    @Override
    public void clear() {

        for (int i = 0; i < capacity; i++) {
            arr[i] = null;
        }

        front = 0;
        rear = -1;

        queueSize = 0;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < queueSize; i++) {

            int index = (front + i) % capacity;

            result.append(arr[index]);

            if (i < queueSize - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }
}
