public class Light {
    private boolean on;
    public boolean isOn() {
        return on;
    }
    private void turnOn(){
        on = true;
    }
    private void turnOff(){
        on = false;
    }
    public void toggle(){
        if(isOn()){
            turnOff();
        }else {
            turnOn();
        }
    }
}
