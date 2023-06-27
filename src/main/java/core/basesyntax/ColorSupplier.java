package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        Color[] colors = Color.values();
        int randomNumber = random.nextInt(colors.length);
        Color randomColor = colors[randomNumber];

        return String.valueOf(randomColor);
    }
}
