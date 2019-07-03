import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // optimized for searching
        List arrayList = new ArrayList();
        // optimized for update/delete operations in the middle of the list
        List linkedList = new LinkedList();

        // Because lists are generic, we should assign a concrete type to them
        List<String> namesList = new ArrayList<>();
        // or
        // List<String> namesList = new ArrayList<String>();
        namesList.add("George");
        namesList.add("Maria");
        namesList.add("Esteban");

        // Check size
        System.out.println("Size of the list:" + namesList.size());

        // Remove element
        namesList.remove("Esteban");
        System.out.println("Size of the list:" + namesList.size());

        namesList.remove(1);
        System.out.println("Size of the list:" + namesList.size());

        String name = namesList.get(0);
        System.out.println("Fist element: " + name);

    }
}
