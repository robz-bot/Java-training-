package Java_Collections;

import java.util.Vector;

/**
 *
 * @author ROBIN RAJESH
 */
class VectorClass{
    void vec(){
        Vector vec=new Vector();
        vec.add(100);
        vec.add(200);
        vec.add(300);
        
        System.out.println("Vector: "+vec);
        System.out.println("Hashcode: "+vec.hashCode());
        System.out.println("Index Of 200: "+vec.indexOf(200));
        System.out.println("Vector contains 400?: "+vec.contains(400));
    }
}
public class VectorImp {
    public static void main(String[] args)
    {
        VectorClass vc=new VectorClass();
        vc.vec();
    }
}
