package Java_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ROBIN RAJESH
 */
class list {

    void ArrayList() {
        System.out.println("1. ArrayList");
        List<String> li = new ArrayList<>();
        li.add("Car");
        li.add("Bike");
        li.add("Motorcycle");

        System.out.println(li);
        Iterator i = li.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    void LinkedList() {
        System.out.println("2. LinkedList");
        List<String> li1 = new LinkedList<>();
        li1.add("Car");
        li1.add("Auto");
        li1.add("Bike");

        System.out.println(li1);
        Iterator j = li1.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }
    }
}

class set {

    void hashset() {
        Set<String> set1 = new HashSet<>();
        set1.add("Phone");
        set1.add("Laptop");
        set1.add("Pendrive");

        System.out.println(set1);
        Iterator i = set1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    void treeset(){
        //sorting,not allow null, allow duplicates
        TreeSet set=new TreeSet();
        set.add(100);
        set.add(23);
        set.add(56);

        System.out.println(set);
        //set.remove("tree2");
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

public class List_Set {

    public static void main(String[] args) {
        System.out.println("LIST:");
        list l = new list();
        l.ArrayList();
        l.LinkedList();

        System.out.println("SET:");
        set s = new set();
        s.hashset();
        s.treeset();
    }
}
