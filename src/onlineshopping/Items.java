package onlineshopping;

public class Items {
    String Name, Type;
    int price;

    public Items(String name, String type, int price) {
        Name = name;
        Type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + Name +"\'"+
                ", Type='" + Type +"\'"+
                ", price=" + price +
                "}\n";
    }
}
