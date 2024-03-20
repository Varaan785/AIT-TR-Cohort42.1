package lesson29;/**
 * AIT-TR, Cohort 42.1, Java Basic, Lesson #29
 * RubberListL29
 * @author Valerian
 * @version 20-Mar-34
 */

import org.w3c.dom.Node;

public class RubberListL29 {
    private int size = 0;
    private Node first;
    private Node last;

    public int size() {
        return size;
    }

    public Integer get(int idx) {
        if (idx == 0) {
            return first.item;
        } else {
            int index = 0;
            Node cursor= first;
            while (cursor.next != null) {
                cursor = cursor.next;
                index++;
                if (idx == index) {
                    return cursor.item;
                }
            }

        }
        return null;
    }

    public void add(int value) {
        if (size == 0) {
            first = new Node(null, value, null);
        } else if (size == 1) {
            last = new Node(first, value,null);
            first.next = last;
        } else {
            Node newLast = new Node(last, value, null);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public void add(int value, int idx) {
        //TODO
    }

    public void remove(int idx) {
            if (idx == 0) {
                if (size == 1) {
                    first = null;
                } else {
                    Node newFirst = first.next;
                    newFirst.prev = null;
                    first = newFirst;
                }
                size--;
            } else {
                int index = 0;
                Node cursor= first;
                while (cursor.next != null) {
                    cursor = cursor.next;
                    index++;
                    if (idx == index) {
                        Node left = cursor.prev;
                        Node right = cursor.next;
                        left.next = right;
                        if (right != null) {
                            right.prev = left;
                    }
                        cursor.prev = null;
                        cursor.next = null;
                        size--;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (size > 0) {
            sb.append(first.item);
        }
        if (size > 1) {
            Node cursor= first;
            while (cursor.next != null) {
                cursor = cursor.next;
                sb.append(", ").append(cursor.item);
            }
        }
        return sb.append("]").toString();
    }

    private static class Node {
        int item;
        Node next;
        Node prev;

        public Node(Node prev, int item, Node next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
