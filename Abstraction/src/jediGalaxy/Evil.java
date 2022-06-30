package jediGalaxy;

public class Evil {

    public static void moveEvil(int currentRowEvil, int currentColEvil, StarsField field) {
        while (currentRowEvil >= 0 && currentColEvil >= 0) {
            if (field.isInBounds(currentRowEvil, currentColEvil)) {
                field.setValue(currentRowEvil, currentColEvil, 0);
            }
            currentRowEvil--;
            currentColEvil--;
        }
    }
}
