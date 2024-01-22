package Conditional_statements.Task_8_Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Good> listOfGoods = new ArrayList<>();

    public Shop() {
    }

    public List<Good> getListOfGoods() {
        return listOfGoods;
    }

    public Shop(List<Good> listOfGoods) {
        this.listOfGoods = listOfGoods;
    }

    public void addNewGood(Good newGood) {
        for (int i = 0; i < listOfGoods.size(); i++) {
        }
        listOfGoods.add(newGood);
    }

}
