package javapk.e6netshop;

public class Product {

    private String name;
    private int id;
    private int price;
    private int count = 0;

    public Product() {
    }

    public Product(String n, int i, int p, int c) {
        name = n;
        id = i;
        price = p;
        count = c;
    }

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getTotal() {
        return price * count;
    }

    public void setCount(int c) {
        count += c;
    }

    public void setId(int i) {
        id = i;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPrice(int i) {
        price = i;
    }

    public String toString() {
        return name + "," + id + "," + price + "," + count;
    }
}
