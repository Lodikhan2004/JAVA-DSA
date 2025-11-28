package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
       System.out.println("List before sorting :" + list);
       //ascending order
       Collections.sort(list);
        System.out.println("List after sorting in ascending : " + list);

       //descending order
       Collections.sort(list, Collections.reverseOrder());
       System.out.println("List after sorting in descending : " + list);

    }


    
}
