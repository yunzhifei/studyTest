package test20170324;

/**
 * Created by 58 on 2017/3/24.
 * author yun zhi fei
 */
public class IntersectionPointOfList {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node.setNext(node2).setNext(node4).setNext(node5).setNext(node3);
        node6.setNext(node2).setNext(node4).setNext(node5).setNext(node3);
        IntersectionPointOfList intersectionPointOfList = new IntersectionPointOfList();
        System.out.println(intersectionPointOfList.calcIntersectionPoint(node, node6));
    }

    public Node calcIntersectionPoint(Node first, Node second) {
        Node firstCopy = first;
        Node secondCopy = second;
        if (null == first || null == second) {
            return null;
        }
        Node result = null;
        int length1 = 0;
        int length2 = 0;
        while (first != null) {
            first = first.getNext();
            length1++;
        }
        while (second != null) {
            second = second.getNext();
            length2++;
        }
        boolean firstMoreLong = length1 > length2;
        int sub = 0;
        if (firstMoreLong) {
            sub = length1 - length2;
            while (sub-- > 0) {
                first = first.getNext();
            }
        } else {
            sub = length2 - length1;
            while (sub-- > 0) {
                second = second.getNext();
            }
        }
        second = secondCopy;
        first = firstCopy;
        while (first != null && second != null) {
            if (first.getNext() == second.getNext()) {
                result = first.getNext();
                break;
            } else {
                first = first.getNext();
                second = second.getNext();
            }
        }
        return result;
    }
}

class Node {
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public Node setNext(Node next) {
        this.next = next;
        return next;
    }

    @Override
    public String toString() {
        System.out.println("the Node value = " + value);
        return "the Node value = " + value;
    }
}
