package com.tgpa.engine;

public abstract class AbstractGame {
    public abstract void update(Container gc, float dt);
    public abstract void render(Container gc, Renderer r);
}
