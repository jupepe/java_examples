package javapk.e6netshop;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {

    private ArrayList products;

    public ShoppingCart() {
        products = new ArrayList();
    }

    public ArrayList getProducts() {
        return products;
    }

    public void setProducts(ArrayList pr) {
        products = pr;
    }

    /**
     * Adds a new Product to the Shopping Cart
     */
    public void setProduct(String n, int i, int p, int c) {
        products.add(new Product(n, i, p, c));
    }

    /**
     * Counts the total sum of the ShoppingCart
     */
    public int getTotal() {
        int sum = 0;
        Iterator iter = products.listIterator();
        while (iter.hasNext()) {
            sum = ((Product) iter.next()).getTotal();
        }
        return sum;
    }

    /**
     * Changes the counter of the item in a shopping cart
     */
    public void setProduct(int id, int val) {
        Iterator iter = products.listIterator();
        while (iter.hasNext()) {
            Product prod = (Product) iter.next();
            if (prod.getId() == id) {
                prod.setCount(val);
                return;
            }
        }
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        Iterator iter = products.listIterator();
        while (iter.hasNext()) {
            str.append((Product) iter.next() + "\n");
        }
        return str.toString();
    }

    /* ---------------------------------------------------- */
    /**
     * testiPääohjelma
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setProduct("Pallo", 1, 10, 2);
        cart.setProduct("Piimä", 2, 15, 3);
        cart.setProduct("Makkara", 3, 24, 4);
        cart.setProduct("Viili", 4, 25, 5);
        /* Print out the whole shopping cart */
        System.out.println(cart);
    }
}
