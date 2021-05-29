
/**
 *Many forms
 *Types: Overloading & Overriding
 * @author ROBIN RAJESH
 */
//Overloading
class formulas {

    void pi() {
        System.out.println("PI: 3.14....");
    }

    void square(int a) {
        System.out.println("Square: " + a * a);
    }

    void rectangle(float l, float b) {
        System.out.println("Rectangle: " + l * b);
    }
}

//overriding
class num1 {

    int a = 10;
}

class num2 extends num1 {

    int a = 11;
}

public class Polymorphism {

    public static void main(String[] args) {
        formulas obj = new formulas();
        obj.pi();
        obj.square(2);
        obj.rectangle(3, 0);

        num1 obj1 = new num2();
        System.out.println(obj1.a);
    }
}
