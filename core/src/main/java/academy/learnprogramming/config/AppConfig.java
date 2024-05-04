package academy.learnprogramming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "academy.learnprogramming")
@Import(GameConfig.class)
public class AppConfig {


}
