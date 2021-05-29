
/**
 *The interface cannot contain concrete(with implementation) methods
 * @author ROBIN RAJESH
 */
interface IStudent {

    void StartSection();

    String StudentName(String SName);

    char StudentGrade(char SGrade);

    void EndSection();
}

abstract class Entry implements IStudent {

    public void StartSection() {
        System.out.println("This is A Section");
    }

    public void EndSection() {
        System.out.println("End of Section");
    }
}

class Studentdetails extends Entry {

    public String StudentName(String SName) {
        return SName;
    }

    public char StudentGrade(char G) {
        return G;
    }
}

public class Interface {

    public static void main(String[] args) {
        IStudent obj = new Studentdetails();
        obj.StartSection();
        System.out.println(obj.StudentName("Robin"));
        System.out.println(obj.StudentGrade('C'));
        obj.EndSection();
    }
}
