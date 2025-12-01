package ArrayList;
import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add Elements  => O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(list.size());

        //print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        //Add at particular index =O(n)
        // list.add(1, 9);
        // System.out.println(list);

        //Get Element => o(1)
        // int elem = list.get(1);
        // System.out.println(elem);

        // //Delete Element => O(n)
        // list.remove(1);
        // System.out.println(list);

        // //Set Element at index => O(n)
        // list.set(2, 10);
        // System.out.println(list);

        //Contains Element =>O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(10));






    }
    
}
