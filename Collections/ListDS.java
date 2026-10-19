package Collections;

import java.util.Objects;

public class ListDS {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);

        // for(int i = 0; i < list.size(); i++){
        // System.out.println(list.get(i));
        // }

        // System.out.println(list.isEmpty());

        // System.out.println(list.indexOf(6));

        // list.set(0, 3);

        list.remove(Integer.valueOf(6));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // List<Integer> list2 = new LinkedList();

        



    }
}

interface List<T> {
    // T value;
    int size();

    void add(T x);

    T get(int idx);

    boolean isEmpty();

    int indexOf(T val);

    void set(int idx, T x);

    void remove(int idx);

    void clear();

    boolean contains(T x);
}

class ArrayList<T> implements List<T> {
    T value;

    private int listCapacity;
    private int listSize;

    private Object[] arr;

    ArrayList() {
        listCapacity = 5;
        listSize = 0;

        arr = new Object[listCapacity];
    }

    ArrayList(int val) {
        listCapacity = val;
        listSize = val;

        arr = new Object[listCapacity];
    }

    public int size() {
        return listSize;
    }

    public void add(T x) {
        if (listSize < listCapacity) {
            arr[listSize] = x;
            listSize++;
        } else {
            Object[] temp = new Object[2 * listCapacity];

            listCapacity = 2 * listCapacity;

            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            arr = temp;

            arr[listSize] = x;
            listSize++;
        }
    }

    @SuppressWarnings("unchecked")
    public T get(int idx) {
        // if(listSize <= idx){
        // throw new Exception("Index out of bound");
        // }

        return (T) arr[idx];
    }

    public boolean isEmpty() {
        return listSize == 0;
    }

    public int indexOf(T val) {
        for (int i = 0; i < listSize; i++) {
            if (val == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public void set(int idx, T x) {
        // if(listSize <= idx){
        // throw new Exception("Index out of bound");
        // }

        arr[idx] = x;
    }

    public void remove(int idx) {
        // if(listSize <= idx){
        // throw new Exception("Index out of bound");
        // }

        for (int i = idx; i < listSize - 1; i++) {
            arr[i] = arr[i + 1];
        }

        listSize--;
    }

    public void remove(T val) {
        for (int i = 0; i < listSize; i++) {
            if (arr[i].equals(val)) {
                remove(i);
                break;
            }
        }
    }

    public void clear() {
        listSize = -1;
    }

    public boolean contains(T x) {
        for (int i = 0; i < listSize; i++) {
            if (arr[i] == x) {
                return true;
            }
        }

        return false;
    }
}

// arr -> _ _ _ _ _

// 3 4 5 6 7 listsize = 5, listCapacity = 5

// arr -> _ _ _ _ _ _ _ _ _ _ <- temp
// 3 4 5 4 7

// 100, 104, 108, 112
// 5, 7, 9, 3

// arr, arr[2]

// 100 + 2 * 4 = 108 - 9

// 5 7 8 9 3

// 100, 104, 108, 112, 116
// 5, 7, 8, 9, 3

// 100, 104, 108, 112
// [5, 104], [7, 108], [9, 112], [3, null]

// 100, 104, 108, 112,
// [5, 104], [7, 120], [9, 112], [3, null]

// 120
// [8, 108]

// 5, 7, 8, 9, 3

// Get Insertion Deletion
// ArrayList O(1) O(n) O(n)
// LinkedList O(n) O(1) O(1)

// [data, next]

// Node n = new Node(5);

// n - Stack

class Node<T> {
    T data;
    Node<T> next;

    Node() {
        this.data = null;
        this.next = null;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

// head -> null
// tail -> null

// head - 120
// tail - 120

// 100
// 5,120

class LinkedList<T> implements List<T> {
    Node<T> head;
    Node<T> tail;

    private int listSize;

    LinkedList() {
        head = null;
        tail = null;
        listSize = 0;
    }

    public int size() {
        return listSize;
    }

    public void add(T x) {
        Node<T> newNode = new Node<>(x);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        listSize++;
    }

    public T get(int idx) {
        // if(idx < 0 || idx >= listSize){
        // throw new Exception("Index out of bound");
        // }

        Node<T> temp = head;

        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void remove(int idx) {
        if (idx == 0) {
            head = head.next;
        } else {
            Node<T> curr = head;
            Node<T> prev = null;

            for (int i = 0; i < idx; i++) {
                prev = curr;
                curr = curr.next;
            }

            prev.next = curr.next;
        }

        listSize--;
    }

    public void clear() {
        head = null;
        tail = null;

        listSize = 0;
    }

    public boolean contains(T x) {
        Node<T> curr = head;

        while (curr != null) {
            if (Objects.equals(curr, x)) {
                return true;
            }
        }

        return false;
    }

    public int indexOf(T x) {
        Node<T> curr = head;

        int i = 0;

        while (curr != null) {
            if (Objects.equals(curr, x)) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public void set(int idx, T val){

    }

    public boolean isEmpty(){
        return head == null;
    }
}
