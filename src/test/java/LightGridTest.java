import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LightGridTest {
    private LightGrid lightGrid;

    @BeforeEach
    public void initialLightGrid() {
        lightGrid = new LightGrid();
    }
    @Test
    void intialBrightness() {
        int expectedBrightness = 0;
        int actualBrightness = lightGrid.getTotalBrightness();

        assertEquals(expectedBrightness, actualBrightness);
    }

    @Test
    @DisplayName("turn on/off one light")
    void turnOneLightOnAndOff() {
        lightGrid.turnOn(new Area(0,0,0,0));
        lightGrid.turnOff(new Area(0,0,0,0));

        int expectedBrightness = 0;
        int actualBrightness = lightGrid.getTotalBrightness();

        assertEquals(expectedBrightness, actualBrightness);
    }
    @Test
    @DisplayName("Turn on 2 lights")
    void turnOn2Lights() {
        lightGrid.turnOn(new Area(0, 0, 0, 0));
        lightGrid.turnOn(new Area(2, 0, 2, 0));

        int expectedBrightness = 2;
        int actualBrightness = lightGrid.getTotalBrightness();

        assertEquals(expectedBrightness, actualBrightness);
    }

}
