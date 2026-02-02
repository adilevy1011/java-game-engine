package com.example.mygame.Entities;

public class Player extends Sprite {
    

    public Player(String imagePath, int x, int y, int width, int height, int health, int speed) {
        super(imagePath, x, y, width, height, health, speed);
    }

    public FireBall shootFireBall(int xSpeed, int ySpeed) {
        // Create a new FireBall instance
        FireBall fireBall = new FireBall("fireball.jpg", this.getX() + this.getWidth(), this.getY() + this.getHeight() / 2 - 10, xSpeed, ySpeed);
        return fireBall;
    }
    
}
