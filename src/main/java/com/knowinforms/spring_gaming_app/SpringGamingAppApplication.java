package com.knowinforms.spring_gaming_app;

import com.knowinforms.spring_gaming_app.game.Game;
import com.knowinforms.spring_gaming_app.game.GameRunner;
import com.knowinforms.spring_gaming_app.game.MarioGame;
import com.knowinforms.spring_gaming_app.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGamingAppApplication {
	public static void main(String[] args) {
		//SpringApplication.run(SpringGamingAppApplication.class, args);
		Game game = new MarioGame();
		Game game1 = new SuperContraGame();
		GameRunner runner = new GameRunner(game1);
		runner.run();
	}

}
