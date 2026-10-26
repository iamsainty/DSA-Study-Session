package Collections;

import java.util.Objects;

// ============================================================
// MAIN CLASS
// ============================================================

// 10% off on item 1

// 20% off on itme 1, 2


// 5% off on item 3 


// --------



// FLAT disc of 200 Rs if order value is greater than 500

// solve(int[] items, int[] discouts, int[] prices, int[] quantity){

// }

// class Item{
//     int qty;
//     float price;
    
//     List<Discount> discount;

//     public Item(int qty, float price){
//         this.qty = qty;
//         this.price = price;

//         discount = new ArrayList<>();
//     }
// }

// Item item1 = new Item(2, 10);

// Item item2 = new Item(4, 20);

// item1.discount.add(d2);
// item2.discount.add(d2);


// item 1 = new item()

// class Discount{
//     int discountpercentage;
//     int id;

//     public Discount(int discountpercentage){
//         this.discountpercentage = discountpercentage;
//     }
// }

// Discount d2 = new Discount(20);




// 20%

// item 2 = new item();


public class ListDS {

    public static void main(String[] args) {

        // 1. ARRAYLIST
        System.out.println("===== ARRAYLIST =====");

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        arrayList.add(1, 100);

        System.out.println(arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element at index 2: " + arrayList.get(2));
        System.out.println("Index of 6: " + arrayList.indexOf(6));
        System.out.println("Contains 7: " + arrayList.contains(7));

        arrayList.set(0, 50);
        arrayList.remove(Integer.valueOf(6));

        System.out.println("After updates: " + arrayList);

        // 2. LINKEDLIST
        System.out.println("\n===== LINKEDLIST =====");

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.add(1, 15);

        System.out.println(linkedList); // linkedList.toString()
        System.out.println("Size: " + linkedList.size());
        System.out.println("Element at index 2: " + linkedList.get(2));

        linkedList.set(0, 5);
        linkedList.remove(Integer.valueOf(20));

        System.out.println("After updates: " + linkedList);

        // 3. VECTOR
        System.out.println("\n===== VECTOR =====");

        List<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        System.out.println(vector);
        System.out.println("Size: " + vector.size());

        vector.add(1, 150);
        vector.remove(0);

        System.out.println("After updates: " + vector);

        // 4. STACK
        System.out.println("\n===== STACK =====");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
    }
}


// List<String> list = new ArrayList<>();
// List<Integer> list2 = new ArrayList<>();
// List<Node> 

// List<Cart>

// <List<Item>

// Object super class 

// List<Object> 

// list.add(1);
// list.add("Hello");

// List<String> list = new ArrayList<>();

// list.add("Hello");
// list.add(1);

// <T>

// Type - Object

// list.get(0) -> String type "Hello";

// Typecasting

// int a = 5;

// a = 10000000000;

// (long) a

// (Integer) arr[index];














// ============================================================
// LIST INTERFACE
// ============================================================

interface List<T> {

    int size();

    boolean isEmpty();

    void add(T value);

    void add(int index, T value);

    T get(int index);

    void set(int index, T value);

    int indexOf(T value);

    boolean contains(T value);

    void remove(int index);

    boolean remove(T value);

    void clear();
}

// ============================================================
// ARRAYLIST
// Internally uses a resizable array.
// ============================================================

class ArrayList<T> implements List<T> {

    private Object[] arr;
    private int listSize;
    private int capacity;

    ArrayList() {
        this(5);
    }

//    [1, 2, 3, 4, 5] = arr
//    [1, 2, 3, 4, 5, 6, _, _, _, _] = arr

    ArrayList(int initialCapacity) {

        if (initialCapacity < 0) {
            throw new IllegalArgumentException(
                    "Capacity cannot be negative");
        }

        capacity = initialCapacity;
        listSize = 0;
        arr = new Object[capacity];
    }

    private void ensureCapacity() {

        if (listSize < capacity) {
            return;
        }

        int newCapacity = (capacity == 0) ? 1 : capacity * 2;

        Object[] temp = new Object[newCapacity];

        for (int i = 0; i < listSize; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
        capacity = newCapacity;
    }

    private void checkIndex(int index) {

        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + listSize);
        }
    }

    private void checkPositionIndex(int index) {

        if (index < 0 || index > listSize) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + listSize);
        }
    }

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public void add(T value) {

        ensureCapacity();

        arr[listSize] = value;
        listSize++;
    }

    @Override
    public void add(int index, T value) {

        checkPositionIndex(index);
        ensureCapacity();

        for (int i = listSize; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        listSize++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {

        checkIndex(index);

        return (T) arr[index];
    }

    @Override
    public void set(int index, T value) {

        checkIndex(index);

        arr[index] = value;
    }

    @Override
    public int indexOf(T value) {

        for (int i = 0; i < listSize; i++) {

            if (Objects.equals(arr[i], value)) {
                return i;
            }
        }

        return -1;
    }

    // int a = 5;
    // int b = 5;

    // a == b -> true

    // Integer a = 6;
    // Integer b = 6;

    // a == b -> false

    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    @Override
    public void remove(int index) {

        checkIndex(index);

        for (int i = index; i < listSize - 1; i++) {
            arr[i] = arr[i + 1];
        }

        listSize--;

        // Release the reference in the unused slot.
        arr[listSize] = null;
    }

    // [1, 2, 3, 4, 5]

    // 1st index remove

    // [1, 3, 4, 5, null]

    @Override
    public boolean remove(T value) {

        int index = indexOf(value);

        if (index == -1) {
            return false;
        }

        remove(index);

        return true;
    }

    @Override
    public void clear() {

        for (int i = 0; i < listSize; i++) {
            arr[i] = null;
        }

        listSize = 0;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < listSize; i++) {

            if (i > 0) {
                result.append(", ");
            }

            result.append(arr[i]);
        }

        result.append("]");

        return result.toString();
    }

    // [1, 2, 3, 4, 5]
}



// ============================================================
// NODE
// Building block of our LinkedList.
// ============================================================

class Node<T> {

    T data;
    Node<T> next;

    Node(){
        this(null);
    }

    Node(T data) {
        this(data, null);
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

// ============================================================
// LINKEDLIST
// Internally uses nodes connected through references.
// ============================================================

class LinkedList<T> implements List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    LinkedList() {
        head = null;
        tail = null;
        listSize = 0;
    }

    private void checkIndex(int index) {

        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + listSize);
        }
    }

    private void checkPositionIndex(int index) {

        if (index < 0 || index > listSize) {
            throw new IndexOutOfBoundsException(
                    "Index: " + index + ", Size: " + listSize);
        }
    }

    private Node<T> nodeAt(int index) {

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    @Override
    public int size() {
        return listSize;
    }

    @Override
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public void add(T value) {
        addLast(value);
    }

    public void addFirst(T value) {

        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        listSize++;
    }

    // H

    // 300
    // 3, 100

    //       T

    // 100         200
    // 1, 200      2, null

    public void addLast(T value) {

        Node<T> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        listSize++;
    }

    @Override
    public void add(int index, T value) {

        checkPositionIndex(index);

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == listSize) {
            addLast(value);
            return;
        }

        Node<T> previous = nodeAt(index - 1);

        Node<T> newNode = new Node<>(value, previous.next);

        previous.next = newNode;

        listSize++;
    }

    @Override
    public T get(int index) {

        checkIndex(index);

        return nodeAt(index).data;
    }

    @Override
    public void set(int index, T value) {

        checkIndex(index);

        nodeAt(index).data = value;
    }

    @Override
    public int indexOf(T value) {

        Node<T> current = head;
        int index = 0;

        while (current != null) {

            if (Objects.equals(current.data, value)) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    @Override
    public void remove(int index) {

        checkIndex(index);

        if (index == 0) {

            head = head.next;
            listSize--;

            if (listSize == 0) {
                tail = null;
            }

            return;
        }

        Node<T> previous = nodeAt(index - 1);
        Node<T> removed = previous.next;

        previous.next = removed.next;

        if (removed == tail) {
            tail = previous;
        }

        listSize--;
    }

    // 1, 2, 3, 4 null



    @Override
    public boolean remove(T value) {

        int index = indexOf(value);

        if (index == -1) {
            return false;
        }

        remove(index);

        return true;
    }

    public T removeFirst() {

        if (isEmpty()) {
            throw new java.util.NoSuchElementException(
                    "List is empty");
        }

        T value = head.data;

        remove(0);

        return value;
    }

    public T removeLast() {

        if (isEmpty()) {
            throw new java.util.NoSuchElementException(
                    "List is empty");
        }

        T value = tail.data;

        remove(listSize - 1);

        return value;
    }

    @Override
    public void clear() {

        head = null;
        tail = null;
        listSize = 0;
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("{");

        Node<T> current = head;

        while (current != null) {

            if (current != head) {
                result.append(", ");
            }

            result.append(current.data);

            current = current.next;
        }

        result.append("}");

        return result.toString();
    }
}

// ============================================================
// VECTOR
// Dynamic array with synchronized public operations.
// ============================================================

class Vector<T> implements List<T> {

    private final ArrayList<T> data;

    Vector() {
        data = new ArrayList<>();
    }

    Vector(int initialCapacity) {
        data = new ArrayList<>(initialCapacity);
    }

    @Override
    public synchronized int size() {
        return data.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public synchronized void add(T value) {
        data.add(value);
    }

    @Override
    public synchronized void add(int index, T value) {
        data.add(index, value);
    }

    @Override
    public synchronized T get(int index) {
        return data.get(index);
    }

    @Override
    public synchronized void set(int index, T value) {
        data.set(index, value);
    }

    @Override
    public synchronized int indexOf(T value) {
        return data.indexOf(value);
    }

    @Override
    public synchronized boolean contains(T value) {
        return data.contains(value);
    }

    @Override
    public synchronized void remove(int index) {
        data.remove(index);
    }

    @Override
    public synchronized boolean remove(T value) {
        return data.remove(value);
    }

    @Override
    public synchronized void clear() {
        data.clear();
    }

    @Override
    public synchronized String toString() {
        return data.toString();
    }
}

// ArrayList - arr

// [1,2,3]

// arr[0] += 3;

// arr[0] += 2;


// Vector - arr



// ============================================================
// STACK
// LIFO: Last In, First Out.
// Built on our custom Vector.
// ============================================================

class Stack<T> {

    private final Vector<T> data;

    Stack() {
        data = new Vector<>();
    }

    public synchronized int size() {
        return data.size();
    }

    public synchronized boolean isEmpty() {
        return data.isEmpty();
    }

    public synchronized void push(T value) {
        data.add(value);
    }

    public synchronized T peek() {

        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }

        return data.get(data.size() - 1);
    }

    public synchronized T pop() {

        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }

        T value = data.get(data.size() - 1);

        data.remove(data.size() - 1);

        return value;
    }

    @Override
    public synchronized String toString() {
        return data.toString();
    }
}