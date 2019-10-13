package Lab4;

public class CircularSinglyLinkedList {
    private static class Node {
        int data;
        Node next;
    }

    private static Node addToEmpty(int data, Node last) {
        if (last != null)
            return last;
        Node temp = new Node();
        temp.data = data;
        last = temp;
        last.next = last;
        return last;
    }

    private static Node addBegin(Node last, int data) {
        if (last == null)
            return addToEmpty(data, last);
        Node temp = new Node();
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        return last;
    }

    private static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(data, last);
        Node temp = new Node();
        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        last = temp;
        return last;
    }

    private static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;
        Node temp, p;
        p = last.next;
        do {
            if (p.data == item) {
                temp = new Node();
                temp.data = data;
                temp.next = p.next;
                p.next = temp;

                if (p == last)
                    last = temp;
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " not present in the list");
        return last;
    }

    private static void traverse(Node last) {
        Node p;
        if (last == null) {
            System.out.println("List is empty");
            return;
        }

        p = last.next;
        do {
            System.out.print(p.data + "   ");
            p = p.next;
        } while (p != last.next);
        System.out.println();
    }

    private static boolean search(Node head, int element) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if (head == null)
            System.out.println("List is empty");
        else {
            do {
                if (current.data == element) {
                    flag = true;
                    break;
                }
                current = current.next;
                i++;
            } while (current != head);
            if (flag)
                System.out.println("Element is in the list at position " + i);
            else
                System.out.println("Element is not in the list");
        }
        return flag;
    }

    private static Node deleteNode(Node head, int key) {
        if (head == null)
            return null;
        Node current = head;
        Node prev = new Node();
        while (current.data != key) {
            if (current.next == head) {
                System.out.println("Given node is not found in the list");
                break;
            }
            prev = current;
            current = current.next;
        }

        if (current.next == head) {
            head = null;
            return head;
        }

        if (current == head) {
            prev = head;
            while (prev.next != head) {
                prev = prev.next;
            }
            head = current.next;
            prev.next = head;
        } else if (current.next == head) {
            prev.next = head;
        } else
            prev.next = current.next;
        return head;
    }

    public static void main(String[] args) {
        Node last = null;
        last = addToEmpty(6, last);
        last = addBegin(last, 4);
        last = addBegin(last, 12);
        last = addEnd(last, 8);
        last = addEnd(last, 10);
        last = addAfter(last, 15, 4);
        traverse(last);
        search(last, 12);
        search(last, 17);
        deleteNode(last, 15);
        deleteNode(last, 12);
        traverse(last);
    }
}
