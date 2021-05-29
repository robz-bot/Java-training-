
/**
 * Wrapping up of data
 *variables of a class will be hidden from other classes, 
 * and can be accessed only through the methods of their current class.
 * @author ROBIN RAJESH
 */
class Electronics {
    private String product="Telivision";
    /**
     * @return the products
     */
    public String getProducts() {
        return product;
    }
    /**
     * @param products the products to set
     */
    public void setProducts(String product) {
        this.product = product;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Electronics eobj = new Electronics();
        System.out.println(eobj.getProducts());
    }
}
