public class LinkedListNEnd {

        public static void main(String args[]) {
            SinglyLinkedList LinkedLi = new SinglyLinkedList();
            LinkedLi.append("1");
            LinkedLi.append("2");
            LinkedLi.append("3");
            LinkedLi.append("4");
            LinkedLi.append("5");
            LinkedLi.append("6");

            System.out.println("cвязный список : " + LinkedLi);

            System.out.println("n-ый узел от конца: " + LinkedLi.getLastNode(4));
        }
    }

    class SinglyLinkedList {
        static class Node {
            private Node next;
            private String data;

            public Node(String data) {
                this.data = data;
            }

            public String toString() {
                return data.toString();
            }
        }

        private Node head;

        public boolean isEmpty() {
            return length() == 0;
        }
        public void append(String data) {
            if (head == null) {
                head = new Node(data);
                return;
            }
            tail().next = new Node(data);
        }
        private Node tail() {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            return tail;
        }
        public int length() {
            int length = 0;
            Node current = head;

            while (current != null) {
                length++;
                current = current.next;
            }
            return length;
        }
        public String getLastNode(int n) {
            Node fast = head;
            Node slow = head;
            int start = 1;

            while (fast.next != null) {
                fast = fast.next;
                start++;

                if (start > n) {
                    slow = slow.next;
                }
            }

            return slow.data;
        }

        public String toString() {
            StringBuilder z = new StringBuilder();

            Node current = head;
            while (current != null) {
                z.append(current).append(" ");
                current = current.next;
            }

            if (z.length() >= 3) {
                z.delete(z.length() - 3, z.length());

            }
            return z.toString();
        }

    }