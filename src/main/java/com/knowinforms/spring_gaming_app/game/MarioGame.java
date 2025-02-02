package com.knowinforms.spring_gaming_app.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements Game {
    public void up(){
        System.out.println("MarioGame.up()");
    }

    public void down(){
        System.out.println("MarioGame.down()");
    }

    public void left(){
        System.out.println("MarioGame.left()");
    }

    public void right(){
        System.out.println("MarioGame.right()");
    }
}
