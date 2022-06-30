package jediGalaxy;

public class Galaxy {
    private StarsField field;

    public Galaxy(StarsField field) {
        this.field = field;
    }

    public void moveEvil(int currentRowEvil, int currentColEvil) {
        Evil.moveEvil(currentRowEvil, currentColEvil, this.field);
    }


    public long moveJedi(int currentRowJedi, int currentColJedi) {
        return Jedi.moveJedi(currentRowJedi, currentColJedi, this.field);
    }

}
