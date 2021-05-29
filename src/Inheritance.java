
/**
 *one class acquires the properties (methods and fields) of another
 * parent child relationship
 * @author ROBIN RAJESH
 */
class ZipCode {
    void zip()
    {
        System.out.println("ZIP: XXX-XXX");
    }
}

class State extends ZipCode
{
    void state()
    {
        System.out.println("State: New State");
    }
}

class City extends State 
{
    void city()
    {
        System.out.println("City: New City");
    }
}

class Address extends City
{
    void add()
    {
        System.out.println("Address");
    }
}


public class Inheritance {

    public static void main(String[] args) {
        Address obj=new Address();
        obj.add();
        obj.city();
        obj.state();
        obj.zip();
    }
}
