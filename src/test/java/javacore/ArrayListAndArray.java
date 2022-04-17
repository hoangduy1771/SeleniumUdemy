package javacore;

import java.util.ArrayList;

public class ArrayListAndArray {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        food.add("Sushi");
        food.add("Ice-cream");
        food.add("Pizza");
        food.add("Steak");
        food.remove(1);
        System.out.println(food);
        for (String item : food) {
            System.out.println(item);
        }
    }
}
