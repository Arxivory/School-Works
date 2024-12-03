package LinkedListImplementation;

public class LinkedListSimulation {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.addElement(1);
        nums.addElement(2);
        nums.addElement(3);
        nums.addElement(4);
        nums.deleteElement(4);
        nums.traverseList();
    }
}
