package roya.taskstwo;

import java.util.HashMap;

public class FoodStore {
    HashMap<String, Integer> foodStore = new HashMap<>();

    public FoodStore() {
        this.foodStore = new HashMap<>();

        foodStore.put("FoodFirst", 5);
        foodStore.put("FoodSecond", 10);
        foodStore.put("FoodThird", 15);

    }


   /* public void takeFood(String foodName, int quantity) throws Exception {

        if (foodStore.containsKey(foodName)) {
            Integer oldAmount = foodStore.get(foodName);
            if (quantity > oldAmount) {
                throw new Exception("Not enough " + foodName + " in foodstore. There is only " + oldAmount + " " + foodName + "."); //there is not that much in the foodstore - throw an error
            } else {
                Integer newAmount = oldAmount - quantity; //decrement the quantity from the old amount
                foodStore.put(foodName, newAmount);  //set the value in the hash map to new amount
            }
        } else {
            throw new Exception("There is no " + foodName + " in the foodstore.");
        }
    }*/
}


