public class Product {
    private String name;
    private float price;
    private int qti;
    private int id;
    public Product() {
        name="Quan";
        price=30000;
        qti=3;
        id=4;
    }
    public Product(String nameN, int idI) {
        name = nameN;
        id = idI;
    }
    public Product(String nameN, int idI, float priceP, int qtiQ) {
        name = nameN;
        id = idI;
        price = priceP;
        qti = qtiQ;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public int getQti() {
        return qti;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public static void main(String[] args) {
        Product objPr1 = new Product("Huy", 1);
        System.out.println(objPr1.getName());
        System.out.println(objPr1.getId());

        Product objPr = new Product("Viet",6,3000,34);
        System.out.println(objPr.getName());
        System.out.println(objPr.getId());
        System.out.println(objPr.getPrice());
        System.out.println(objPr.getQti());

        Product objPr2 = new Product();
        System.out.println(objPr2.getName());
        System.out.println(objPr2.getId());
        System.out.println(objPr2.getPrice());
        System.out.println(objPr2.getQti());
    }
}
