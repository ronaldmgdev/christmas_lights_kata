import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LightGridTest {
    LightGrid lightGrid;

    @BeforeEach
    public void initialLightGrid() {
        lightGrid = new LightGrid();
    }
    @Test
    @DisplayName("No lights onn")
    void intialBrightness() {
        int expectedBrightness = 0;
        int actualBrightness = lightGrid.getTotalBrightness();

        assertEquals(expectedBrightness, actualBrightness);
    }
    @Test
    @DisplayName("Turn on one light")
    void turnOnOneLight() {
        lightGrid.turnOn(new Area(0, 0, 0, 0));

        int epectedBrightness = 1;
        int actualBrightness = lightGrid.getTotalBrightness();

        assertEquals(epectedBrightness, actualBrightness);
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

    @Test
    @DisplayName("Turn on intersecting lights")
    void turningOnIntersectingSections() {
        lightGrid.turnOn(new Area(0, 0, 1, 1));
        lightGrid.turnOn(new Area(0, 0, 0, 0));

        int expectedBrightness = 5;
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
    @DisplayName("Turn on all lights")
    void ShouldTurnOnAllLights() {
        lightGrid.turnOn(new Area(0,0,999,999));

        int expectedBrightness = 1000000;
        int actualBrightness = lightGrid.getTotalBrightness();

        assertEquals(expectedBrightness, actualBrightness);
    }

    @Test
    @DisplayName("Toggle first line")
    void shouldToggleFirstLine() {
        lightGrid.toggle(new Area(0,0,0,999));

        int expectedBrightness = 2000;
        int actualBrightness = lightGrid.getTotalBrightness();

        assertEquals(expectedBrightness, actualBrightness);
    }
}
