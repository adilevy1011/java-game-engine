package com.example.mygame.Entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class Sprite {
    private String imagePath;
    private int x;
    private int y;
    private int width;
    private int height;
    
    private Texture texture;
    /**
     * Constructor for Sprite class.
     * @param imagePath
     * @param x
     * @param y
     * @param width
     * @param height
     * @param health
     * @param speed
     */
    public Sprite(String imagePath, int x, int y, int width, int height, int health, int speed) {
        this.texture = new com.badlogic.gdx.graphics.Texture(imagePath);
        this.imagePath = imagePath;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
       

    }
    /**
     * Check collision with another sprite.
     * @param other
     * @return
     */
    public boolean collidesWith(Sprite other) {
        return this.x < other.x + other.width &&
               this.x + this.width > other.x &&
               this.y < other.y + other.height &&
               this.y + this.height > other.y;
    }
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public Texture getTexture() {
        return texture;
    }
    
    public void draw(SpriteBatch batch, ShapeRenderer shapeRenderer) {
        

        // Draw sprite
        if(imagePath != null){
            batch.begin();
            batch.draw(texture, x, y, width, height);
            batch.end();
        } else{
            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(Color.BROWN);
            shapeRenderer.rect(x, y, width, height);
            shapeRenderer.end();
        }
    }
}