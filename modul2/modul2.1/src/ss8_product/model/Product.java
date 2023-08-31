package ss8_product.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String moTa;

    public Product() {
    }

    public Product(int id, String name, int price, String moTa) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", moTa='" + moTa + '\'' +
                '}';
    }

}
