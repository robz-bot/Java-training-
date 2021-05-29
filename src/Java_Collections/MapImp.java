package Java_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Converting map to set
 *
 * @author ROBIN RAJESH
 */
class map {

    void HashMap() {
        System.out.println("1. HashMap");
        HashMap m = new HashMap();
        m.put(1, "Car");
        m.put(2, "Bike");
        m.put(3, "Motorcycle");

        System.out.println("Map: " + m);
        Set s = m.entrySet();
        System.out.println("Set: " + s);

        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    void TreeMap(String str) {
        System.out.println("2. TreeMap");
        HashMap m = new HashMap();
        m.put(1, "Car");
        m.put(2, "Bike");
        m.put(3, "Motorcycle");

        System.out.println("Map: " + m);
        Set s = m.entrySet();
        System.out.println("Set: " + s);

        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        if (m.containsValue(str)) {
            System.out.println("The Given String '" + str + "' is in the Map");
        }
    }
}

public class MapImp {

    public static void main(String[] args) {
        map m = new map();
        m.HashMap();
        m.TreeMap("Car");
    }
}
