package com.knowinforms.spring_gaming_app.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGame")
public class PacmanGame implements Game{
    public void up(){
        System.out.println("PacmanGame.up()");
    }

    public void down(){
        System.out.println("PacmanGame.down()");
    }

    public void left(){
        System.out.println("PacmanGame.left()");
    }

    public void right(){
        System.out.println("PacmanGame.right()");
    }
}
