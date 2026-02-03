package com.example.mygame.Screens;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Button {
    
    private float x, y, width, height;
    private String label;
    private BitmapFont font;
    private GlyphLayout layout = new GlyphLayout();

    public Button(String label, float x, float y, float width, float height, Batch batch, ShapeRenderer shapeRenderer, BitmapFont font) {
        this.label = label;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.font = font;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public String getLabel() {
        return label;
    }

    public boolean isClicked(float mouseX, float mouseY) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }
    public void drawShape(ShapeRenderer sr){
    sr.setColor(0.2f, 0.6f, 0f, 1);
    sr.rect(x, y, width, height);
    }

    public void drawText(SpriteBatch batch){
        layout.setText(font, label);
        float textX = x + (width - layout.width) / 2f;
        float textY = y + (height + layout.height) / 2f;
        font.draw(batch, layout, textX, textY);
    }
}
