import java.util.*;

public class LinkedListTest {
    public static void main(String[] args)
    {
        LinkedList<String> linkedli = new LinkedList<String>();
        linkedli.add("1");
        linkedli.add("2");
        linkedli.add("3");
        linkedli.add("4");
        linkedli.add("5");
        linkedli.add("6");
        System.out.print("Элементы до разворота: " + linkedli);
        linkedli = reverseLinkedList(linkedli);
        System.out.print("\nЭлементы после разворота: " + linkedli);
    }
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}