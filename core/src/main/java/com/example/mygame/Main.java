package com.example.mygame;


import com.badlogic.gdx.Game;
import com.example.mygame.Screens.*;

/**
 * Main game class that initializes and runs the screens.
 */
public class Main extends Game {
    
    private MenuScreen menuScreen;
    /**
     * Called when the application is created.
     */
    @Override
    public void create() {
        menuScreen = new MenuScreen(this);
        setScreen(menuScreen);
    }

    

    
}
