package academy.learnprogramming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator{

    private final Random random = new Random();

    private final int maxNumber;

    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
