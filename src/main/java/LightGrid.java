import java.lang.reflect.Array;
import java.util.Arrays;

public class LightGrid {
    int[][] brightness = new int[1000][1000];

    public int getTotalBrightness() {
        return Arrays.stream(brightness).flatMapToInt(Arrays::stream).sum();
    }

    public void turnOn(Area area) {
        applyCommandToArea(new Brighter(), area);
    }
    public void turnOff(Area area){
        applyCommandToArea(new Dimmer(), area);
    }
    public void toggle(Area area) {
        applyCommandToArea(new BrightnessToggler(), area);
    }
    private void applyCommandToArea(LightBrightnessChanger lightBrightnessChanger, Area area) {
        for (int x = area.getX1(); x <= area.getX2(); x++) {
            for (int y = area.getY1(); y <= area.getY2(); y++) {
                brightness[x][y] = lightBrightnessChanger.execute(brightness[x][y]);
            }
        }
    }
    private static class BrightnessToggler implements LightBrightnessChanger {
        @Override
        public int execute(int brightness) {
            return brightness + 2;
        }
    }
    private static class Brighter implements LightBrightnessChanger {
        @Override
        public int execute(int brightness) {
            return brightness + 1;
        }
    }
    private static class Dimmer implements LightBrightnessChanger {
        @Override
        public int execute(int brightness) {
            return Math.max(0, brightness - 1);
        }
    }
}
