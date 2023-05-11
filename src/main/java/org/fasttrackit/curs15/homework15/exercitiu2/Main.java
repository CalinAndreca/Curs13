package org.fasttrackit.curs15.homework15.exercitiu2;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
    Shop<ShopItem> shop = new Shop<>();

    Clothes tShirt = new Clothes("T-Shirt",20,Category.NEW);
    shop.addItem(tShirt);

    Clothes dress = new Clothes("Dress", 50, Category.ON_SALE);
    shop.addItem(dress);

    Electronics phone = new Electronics("Phone",500, Category.REFURBISHED);
    shop.addItem(phone);

    Fruit apple = new Fruit("Apple", 2, Category.NEW);
    shop.addItem(apple);

        List<ShopItem> newItems = shop.findByCategory(Category.NEW);
        System.out.println("New Items: ");
        for (ShopItem item : newItems){
            System.out.println(item.name()+ " " + item.price());
        }
        List<ShopItem> cheapItems = shop.findWithLowerPrice(30);
        System.out.println("Cheapest items: ");
        for (ShopItem item : cheapItems){
            System.out.println(item.name()+ " " + item.price());
        }
        Optional<ShopItem> optionalItem = shop.findByName("Dress");
        if (optionalItem.isPresent()){
            ShopItem item = optionalItem.get();
            System.out.println("Found item: "+item.name() + " price " +item.price());
        }else {
            System.out.println("Item not found");
        }
        Optional<ShopItem> removedItem = shop.removeItem("Phone");
        if (removedItem.isPresent()){
            ShopItem item = removedItem.get();
            System.out.println("Removed item: " + item.name()+ " price " +item.price());
        }else {
            System.out.println("Item not found");
        }
    }
}
