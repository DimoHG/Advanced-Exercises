package jediGalaxy;

public class Jedi {
    public static long moveJedi(int currentRowJedi, int currentColJedi, StarsField field) {
        long starsCollected = 0;
        while (currentRowJedi >= 0 && currentColJedi < field.getColLength()) {
            if (field.isInBounds(currentRowJedi, currentColJedi)) {
                starsCollected += field.getValue(currentRowJedi, currentColJedi);
            }
            currentColJedi++;
            currentRowJedi--;
        }
        return starsCollected;
    }
}
