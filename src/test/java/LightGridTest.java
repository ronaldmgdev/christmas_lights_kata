import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LightGridTest {

    int numberOfLights = 1000;
    @Test
    @DisplayName("Create Light Grid class")
    void shouldCreateLightGrid(){
        LightGrid lightGrid = new LightGrid();
    }

    @Test
    @DisplayName("Turn on all lights")
    void ShouldTurnOnAllLights() {
        LightGrid lightGrid = new LightGrid();
        lightGrid.turnOn(CoordinatePair.of(0,0,999,999));
        for (int i = 0; i < numberOfLights; i++) {
            for (int j = 0; j < numberOfLights; j++) {
                assertThat(lightGrid.getLight(i,j).isOn(), is(true));
            }
        }
    }

    @Test
    @DisplayName("Toggle first line")
    void shouldToggleFirstLine(){
        LightGrid lightGrid = new LightGrid();
        lightGrid.toggle(CoordinatePair.of(0,0,0,999));
        for (int i = 0; i < numberOfLights; i++) {
            for (int j = 0; j <numberOfLights; j++) {
                if(i==0) {
                    assertThat(lightGrid.getLight(i,j).isOn(), is(true));
                }
                assertThat(lightGrid.getLight(i,j).isOn(), is(false));
            }
        }
    }
}
