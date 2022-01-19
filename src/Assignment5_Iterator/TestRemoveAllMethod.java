package Assignment5_Iterator;

public class TestRemoveAllMethod {

    public static void main(String[] args) {

        KWLinkedList <String> list = new KWLinkedList <>();
        list.add("The");
        list.add("hello");
        list.add("peace");
        list.add("peace");

        System.out.println(list);

        list.removeAllOf("peace");

        System.out.println(list);
    }
}
