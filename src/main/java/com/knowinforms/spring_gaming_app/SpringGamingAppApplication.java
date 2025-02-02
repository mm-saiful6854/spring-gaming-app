package com.knowinforms.spring_gaming_app;

import com.knowinforms.spring_gaming_app.game.Game;
import com.knowinforms.spring_gaming_app.game.GameRunner;
import com.knowinforms.spring_gaming_app.game.MarioGame;
import com.knowinforms.spring_gaming_app.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringGamingAppApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringGamingAppApplication.class, args);

//		Game game = new MarioGame();
//		Game game1 = new SuperContraGame();

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
