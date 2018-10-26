package com.tgpa.abstractgame;

import com.tgpa.engine.AbstractGame;
import com.tgpa.engine.Container;
import com.tgpa.engine.Renderer;

import java.awt.event.KeyEvent;

public class GameManager extends AbstractGame {

    public GameManager(){

    }

    @Override
    public void update(Container gc, float dt) {
        if(gc.getInput().isKeyDown(KeyEvent.VK_A)){
            System.out.println("A was pressed");
        }
    }

    @Override
    public void render(Container gc, Renderer r) {

    }

    public static void main(String[] args) {
        Container gc = new Container(new GameManager());
        gc.start();
    }
}
