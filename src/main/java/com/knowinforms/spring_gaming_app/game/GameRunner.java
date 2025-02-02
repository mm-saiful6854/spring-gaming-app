package com.knowinforms.spring_gaming_app.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired
    @Qualifier("PacmanGame")
    private Game game;
//    public GameRunner(Game game) {
//        this.game = game;
//    }


    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
