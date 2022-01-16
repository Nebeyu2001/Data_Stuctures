package Assignment4;

import javax.imageio.stream.ImageInputStream;

public class SingleLinkedList<E> {

    private Node<Integer> head = null;
    private int size = 0;

    private static class Node<E> {

        private Integer data;
        private Node<E> next;

        private Node(int item) {

            this.data = item;
            this.next = null;
        }

        private Node(int item, Node<E> nodeRef) {
            this.data = item;
            this.next = nodeRef;
        }

    }

        private void add(int item){
            Node<Integer> temp = new Node<>(item,head);
            head = temp;
            size++;
        }

        private int size(){
        return size;
        }

        private boolean find(int item) {

            if (head == null) {
                return false;
            }
            Node<Integer> node = head;
            if (node.data == item) {
                return true;
            }

            while (node.next != null) {
                if (item == (node.next.data)) {
                    return true;
                }
                node = node.next;
            }
            return false;
        }

        private Node<Integer> getNode(int index) {

            Node<Integer> node = head;
            for (int i = 0; i < index && node != null; i++) {
                node = node.next;

            }
            return node;

        }

        private int max(){
        int maxNum = getNode(0).data;
        Node<Integer> node = head;
        while(node!=null){
            if(node.data > maxNum){
                maxNum = node.data;
            }
            node = node.next;
        }
        return maxNum;
        }

        private int min() {
        int minNum = getNode(0).data;
        Node<Integer> node = head;

        while (node != null){

            if(node.data < minNum){
                minNum = node.data;
            }
            node = node.next;

        }
        return minNum;



        }


    public static void main(String[] args) {

    SingleLinkedList<Integer> sl = new SingleLinkedList<Integer> ();

    sl.add(5);
    sl.add(10);
    sl.add(15);
    sl.add(3);

        System.out.println(sl.size());
        System.out.println(sl.find(10));
        System.out.println(sl.max());
        System.out.println(sl.min());

    }

    }


