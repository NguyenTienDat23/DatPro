public class product {
    private String name;
    private int id;
    private int quantity;
    private float price;
    public product(String n,int i, int qty ,float p){
        name = "n";
        id = 1;
        quantity = 100;
        price = 5000;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getQuantity(){
        return quantity;
    }
    public float getPrice(){
        return price;
    }

    public static void main(String[] args) {
        product s1 = new product("n",1,100,5000);
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getQuantity());
        System.out.println(s1.getPrice());
    }

}
