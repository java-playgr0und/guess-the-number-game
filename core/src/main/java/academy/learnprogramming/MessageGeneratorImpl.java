package academy.learnprogramming;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class MessageGeneratorImpl implements MessageGenerator{
    private final Game game;

    @Autowired
    public MessageGeneratorImpl(Game game) {
        this.game = game;
    }

    @PostConstruct
    public void init(){
        log.info("message generator init post construct");
    }

    @Override
    public String getMainMessage() {
        return String.format("Number is between %d and %d. Can You guess it ?",game.getSmallest(),game.getBiggest());

    }

    @Override
    public String getResultMessasge() {
        if(game.isGameWon()){
            return String.format("You guessed it! The number was %d",game.getNumber());
        } else if (game.isGameLost()){
            return String.format("You lost. The number was %d",game.getNumber());
        } else if (!game.isValidNumberRange()){
            return "Invalid Number Range!";
        } else if(game.getRemainingGuesses() == game.getGuessCount()){
            return "What is your first guess?";
        } else {
            String direction = "Lower";

            if(game.getGuess() < game.getNumber()){
                direction="Higher";
            }

            return String.format("%s! You Have %d guess left.",direction,game.getRemainingGuesses());
        }
    }
}
