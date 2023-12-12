public class CoordinatePair {
    private  final int leftTopX;
    private final int leftTopY;
    private final int rightBottomX;
    private final int rightBottomY;

    public CoordinatePair(int leftTopX, int leftTopY, int rightBottomX, int rightBottomY) {
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
        this.rightBottomX = rightBottomX;
        this.rightBottomY = rightBottomY;
    }

    public static CoordinatePair of(int leftTopX, int leftTopY, int rightBottomX, int rightBottomY){
        return new CoordinatePair(leftTopX, leftTopY, rightBottomX, rightBottomY);
    }

    public int leftTopX(){ return leftTopX; }
    public int leftTopY(){ return leftTopY; }
    public int rightBottomX() { return rightBottomX; }
    public int rightBottomY() { return rightBottomY; }
}
