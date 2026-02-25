# Java Game Engine Prototype

*Author: Adi Levy*

## Overview
This project is an object-oriented game framework built in Java using the LibGDX library.  
It features a structured game loop, menu system, screen management, and a basic player vs enemy combat system.  
The focus of this project is on software architecture and OOP design rather than narrative content.

## Core Features
- Custom game loop
- Menu, pause, and game screens
- Object-oriented class hierarchy for game entities
- Player vs enemy combat prototype
- Modular level structure (LevelOne implemented as a template)

## Controls
- **WASD** – Player movement  
- **Arrow keys** – Fireball shooting  
- **Escape** – Pause game  

## Class Structure
```
Button
Sprite
├──FireBall
├──Obstacle
└──LivingEntity
    ├──Enemy
    └──Player
MenuScreen (implements LibGDX Screen)
PauseScreen (implements LibGDX Screen)
GameScreen (implements LibGDX Screen)
└──LevelOne
```
## Installation & Running
- Requires Java 17
- Uses Gradle for dependency management
- Download `MyGame.jar` from this repository
- Run from command line: `java -jar MyGame.jar`  
- Or double-click the jar to launch the game

## Credits:
All code and assets were created by Adi Levy. 

