public class LightGrid {
    private Light[][] lights = new Light[1000][1000];

    public void turnOn(CoordinatePair coordinatePair) {
        for (int col = coordinatePair.leftTopX(); col <= coordinatePair.rightBottomX(); col++) {
            for (int row = coordinatePair.leftTopY(); row <= coordinatePair.rightBottomY(); row++) {
                getLight(row, col).toggle();
            }
        }
    }
    public Light getLight(int row, int col) {
        return lights[row][col];
    }
    public void toggle(CoordinatePair coordinatePair){
        for (int col = coordinatePair.leftTopX(); col <= coordinatePair.rightBottomX(); col++) {
            for (int row = coordinatePair.leftTopY(); row <= coordinatePair.rightBottomY(); row++) {
                getLight(row, col).toggle();
            }
        }
    }
}
