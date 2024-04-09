/*
 * Created on 2024-04-08
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.Random;

public abstract class Food {
    public abstract Position getPosition();

    public abstract String getIcon();

    public static Food randomFood(Position position) {
        int numFood = 1; // Represents the number of food items

        int randomNumber = new Random().nextInt(numFood);

        switch (randomNumber) {
            // TODO: Add two more food items!
            case 0:
                return new Cherry(position);
            default:
                return null;
        }

    }
}
