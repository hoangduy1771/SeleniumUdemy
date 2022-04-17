package javacore;

public class Loops {
    public static void main(String[] args) {
        loops();
        loopsDecorative();
    }

    public static void loops() {
        int[] arr = {6, 5, 4, 3, 2, 1};
        for (int j : arr) {
            System.out.println(j);
        }

        String[] cities = {"Ho Chi Minh", "Tokyo", "New York", "London", "Paris"};
        for (int i = cities.length - 1; i >= 0; i--) {
            System.out.println(cities[i]);
        }
    }

    public static void loopsDecorative() {
        String[] cities = {"Ho Chi Minh", "Tokyo", "New York", "London", "Paris"};
        for (String city : cities) {
            System.out.println(city);
        }
    }

}
