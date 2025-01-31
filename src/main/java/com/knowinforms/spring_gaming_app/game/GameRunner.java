package com.knowinforms.spring_gaming_app.game;

public class GameRunner {
    Game game;
    public GameRunner(Game game) {
        this.game = game;
    }


    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
