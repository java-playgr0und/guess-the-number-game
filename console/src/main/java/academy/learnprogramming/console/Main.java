package academy.learnprogramming.console;


import academy.learnprogramming.config.AppConfig;
import academy.learnprogramming.Game;
import academy.learnprogramming.MessageGenerator;
import academy.learnprogramming.NumberGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args){
        log.info("Guess the number game from console");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        int number = numberGenerator.next();

        log.info("number = {}",number);

        Game game =context.getBean(Game.class);

        log.info("GET MAIN MESSAGE {}",messageGenerator.getMainMessage());
        log.info("GET RESULT MESSAGE {}",messageGenerator.getResultMessasge());

        context.close();
    }
}
