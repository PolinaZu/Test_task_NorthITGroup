package Conditional_statements.Task_8_Shop;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Good good1 = new Good(1, "Шампунь", 356);
        Good good2 = new Good(2, "Расческа", 556);
        Good good3 = new Good(3, "Заколка", 233);

        shop.addNewGood(good1);
        shop.addNewGood(good2);
        shop.addNewGood(good3);

        showMenu(shop);
        selectGood(shop);
    }

    public static void showMenu(Shop shop) {
        System.out.println("Выберите товар: ");
        List<Good> listOfGoods = shop.getListOfGoods();
        for (Good good : listOfGoods)
            System.out.println(good);
    }

    public static void selectGood(Shop shop) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер товара");
        List<Good> listOfGoods = shop.getListOfGoods();
        int enteredNumber = scan.nextInt();
        for (int i = 0; i < listOfGoods.size(); i++) {
            if (enteredNumber == listOfGoods.get(i).getGoodId()) {
                System.out.println("Введите сумму денег, которой вы располагаете");
                int amountOfMoney = scan.nextInt();
                if (amountOfMoney < listOfGoods.get(i).getPrice()) {
                    System.out.println("Денег не хватает!");
                } else if (amountOfMoney == listOfGoods.get(i).getPrice()) {
                    System.out.println("Спасибо за покупку!");
                } else {
                    int change = amountOfMoney - listOfGoods.get(i).getPrice();
                    System.out.println("Ваша сдача: " + change);
                }
            }
        }
        if (enteredNumber > listOfGoods.size()) {
            System.out.println("Такого товара нет в магазине");
        }
    }
}
