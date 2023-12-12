public class ChristmasLights {

    public static void main(String[] args) {
        LightGrid lightGrid = new LightGrid();
        lightGrid.turnOn(new Area(0, 1, 0, 1)); // 1 light
        lightGrid.turnOn(new Area(1, 4, 1, 4)); // 2 lights

        System.out.println(lightGrid.getTotalBrightness());
    }
}
