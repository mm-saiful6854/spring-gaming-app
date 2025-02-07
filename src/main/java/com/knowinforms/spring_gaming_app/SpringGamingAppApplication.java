package com.knowinforms.spring_gaming_app;

import com.knowinforms.spring_gaming_app.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringGamingAppApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringGamingAppApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
