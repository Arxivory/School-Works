package LinkedListImplementation;
/*
    Author: Vince Aivan P. Rumalay
    Section: BSCS2A
    Institution: Centro Escolar University
    Date Created: November 29 - December 3, 2023
*/
public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    public LinkedList() {}
    public boolean addElement(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> traverser = head;
            while (traverser.next != null) {
                traverser = traverser.next;
            }
            traverser.next = newNode;
            tail = newNode;
        }
        return true;
    }
    public boolean deleteElement(T data) {
        if (head.data == data) {
            head = head.next;
            return true;
        }
        Node<T> traverser = head;
        while (traverser.next.data != data) {
            traverser = traverser.next;
            if (traverser.next == null) return false;
        }
        traverser.next = traverser.next.next;
        return true;
    }

    public void traverseList() {
        System.out.print("[");
        Node<T> traverser = head;
        while (traverser != null) {
            if (traverser.next != null)
                System.out.print(traverser.data + ", ");
            else
                System.out.print(traverser.data + "]");

            traverser = traverser.next;
        }
    }
}

class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
