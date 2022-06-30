package jediGalaxy;

public class StarsField {
    private int[][] starsField;

    public StarsField(int rows, int cols) {
        this.starsField = new int[rows][cols];
        this.fillInStarsField(rows, cols);
    }

    public void fillInStarsField(int rows, int cols) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                this.starsField[row][col] = value++;
            }
        }
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && col >= 0 && row < this.starsField.length && col < this.starsField[row].length;
    }

    public int getValue(int row, int col){
        return this.starsField[row][col];
    }

    public void setValue(int row, int col, int newValue){
        this.starsField[row][col] = newValue;
    }

    public int getColLength(){
        return this.starsField[1].length;
    }

}
