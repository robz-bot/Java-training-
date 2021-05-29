package Java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author ROBIN RAJESH
 */
class AgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class NameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        return s1.name.compareTo(s2.name);
    }
}

class Student {

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class CC {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Student(100, "Karthick", 21));
        al.add(new Student(106, "Dinesh", 23));
        al.add(new Student(200, "Jack", 18));

        System.out.println("Compaator");
        System.out.println("Sorting by Name");
        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("Sorting by age");
        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }
}
