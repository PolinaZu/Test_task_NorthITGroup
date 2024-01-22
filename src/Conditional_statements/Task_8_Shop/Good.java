package Conditional_statements.Task_8_Shop;

public class Good {

    private int goodId;
    private String name;
    private int price;

    public Good(int goodId, String name, int price) {
        this.goodId = goodId;
        this.name = name;
        this.price = price;
    }

    public int getGoodId() {
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
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

    @Override
    public String toString() {
        return "Товар: " +
                goodId + " " +
                name +
                ", цена товара: " + price;
    }
}
