package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random randomNumber = new Random();

    public String getRandomColor() {
        return Color.values()[randomNumber.nextInt(Color.values().length)].name();
    }
}
