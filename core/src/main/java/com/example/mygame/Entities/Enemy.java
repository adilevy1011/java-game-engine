package com.example.mygame.Entities;


public class Enemy extends Sprite {
    
    private int damage; 
    
    public Enemy(String imagePath, int x, int y, int width, int height) {
        super(imagePath, x, y, width, height, 100, 1);
        this.damage = 3;
    }

    public void takeStepTowardsPlayer(Player player) {
        if (player.getX() > this.getX()) {
            this.moveRight();
        } else if (player.getX() < this.getX()) {
            this.moveLeft();
        }

        if (player.getY() > this.getY()) {
            this.moveUp();
        } else if (player.getY() < this.getY()) {
            this.moveDown();
        }
    }
    public int getDamage() {
        return damage;
    }
}
