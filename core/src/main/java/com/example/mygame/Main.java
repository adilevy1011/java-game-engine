package com.example.mygame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.example.mygame.Screens.*;
import com.badlogic.gdx.Screen;

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
