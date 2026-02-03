package com.example.mygame.Entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class LivingEntity extends Sprite {

    private int health;
    private int maxHealth;
    private int speed;

    public LivingEntity(String imagePath, int x, int y, int width, int height, int health, int speed) {
        super(imagePath, x, y, width, height, health, speed);
        this.health = health;
        this.maxHealth = health;
        this.speed = speed;
    }

    public void moveUp() {
        this.setY(this.getY() + this.getSpeed());
    }

    public void moveDown() {
        this.setY(this.getY() - this.getSpeed());
    }

    public void moveLeft() {
        this.setX(this.getX() - this.getSpeed());
    }

    public void moveRight() {
        this.setX(this.getX() + this.getSpeed());
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    public void heal(int amount) {
        this.health += amount;
    }

    public boolean isDead() {
        return this.health <= 0;
    }
    public void draw(SpriteBatch batch, ShapeRenderer shapeRenderer){
        super.draw(batch, shapeRenderer);
        // Draw health bar
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(com.badlogic.gdx.graphics.Color.RED);
        shapeRenderer.rect(this.getX(), this.getY() + this.getHeight() + 5, this.getWidth() * ((float)this.getHealth() / this.maxHealth), 5);
        shapeRenderer.end();
    }
    
}
