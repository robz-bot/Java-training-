
/**
 *hiding certain details and showing only essential information
 *achieved with either abstract classes or interfaces
 * @author ROBIN RAJESH
 */
abstract class Car {

    abstract void status();
}

class BMW extends Car {

    @Override
    void status() {
        System.out.println("BMW Works fine...");
    }
}

class Kia_Seltos extends BMW {

    @Override
    void status() {
        System.out.println("Kia Seltos Works fine...");
    }
}

public class Abstaraction {

    public static void main(String[] args) {
        Car obj = new Kia_Seltos();
        Car obj1 = new BMW();
        obj.status();
        obj1.status();
    }
}
