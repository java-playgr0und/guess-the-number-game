package academy.learnprogramming.console;


import academy.learnprogramming.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args){
        log.info("Guess the number game from console");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.close();
    }
}
