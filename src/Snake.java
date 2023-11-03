/*
 * Created on 2024-04-08
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import java.util.ArrayList;

public class Snake {
    private SnakeSegment head;
    private Direction direction = Direction.RIGHT; // Default direction

    public Snake() {
        // You may change this code for extra credit (implement some fancy stuff!)
        // Feel free to make the starting position random
        Position startingPosition = new Position(10, 10);
        head = new SnakeSegment(startingPosition);
    }

    // TODO: The snake should grow whenever it "eats" a food item
    public void grow() {

    }

    // TODO: Remove the last node (tail) of the snake, leave head untouched
    private void removeTail() {

    }

    // Returns true if the snake is colliding with itself
    public boolean isColliding() {
        if (isInSnake(head.getPosition())) {
            return true;
        }
        return false;
    }

    // TODO: Implement isInSnake
    // Returns false if the specified position is inside the body of the snake
    public boolean isInSnake(Position position) {
        return false;
    }

    // TODO: Implement setDirection
    // Sets the direction the snake will move in
    public void setDirection(Direction direction) {

    }

    // TODO: Get the length of the snake 
    public int getLength() {
        int count = 0;

        return count;
    }

    // Moves the snake by one in the next direction
    // TODO: Implement move
    public void move() {
        // HINT: You may add and remove nodes here
        Position newPosition = head.getPosition().add(direction.deltaPosition());

        // ...

        // TODO: Uncomment!
        // if (!grow) {
        //    removeTail();
        // } else {
        //    grow = false;
        // }
    }

    // TODO: Return the head of the snake
    public SnakeSegment getHead() {
        return null;
    }

    // TODO: Return the start of the body (NOT the head!)
    public SnakeSegment getBody() {
        return null;
    }

    public void pause() {
        // OPTIONAL: Pause/unpause the snake
    }

    public Direction getMove(ArrayList<Food> food) {
        // OPTIONAL: Implement an algorithm that moves the food for us!
        return null;
    }

    public boolean isPositionOutOfBounds() {
        Position position = head.getPosition();
        if (position.x < 0 || position.x > 800 || position.y < 0 || position.y > 600) {
            System.out.println("Out of bounds");
            return true;
        } 
        return false;
    }
}

class SnakeSegment {
    private Position position;
    private SnakeSegment next;

    public SnakeSegment(Position pos) {
        this.position = pos;
    }

    public Position getPosition() {
        return this.position;
    }

    public SnakeSegment getNext() {
        return this.next;
    }

    public void setNext(SnakeSegment next) {
        this.next = next;
    }
}
