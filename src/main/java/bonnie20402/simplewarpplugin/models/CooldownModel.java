package bonnie20402.simplewarpplugin.models;

public class CooldownModel {
    private int seconds;

    public CooldownModel(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
