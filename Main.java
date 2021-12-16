package roya.taskstwo;

public class Main {

    public static void main(String[] args) throws Exception {

     FoodStore foodStore = new FoodStore();

     foodStore.foodStore.forEach((foodName, value) -> System.out.println(foodName + value));


    }

}