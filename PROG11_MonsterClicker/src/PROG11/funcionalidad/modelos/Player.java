package PROG11.funcionalidad.modelos;

/**
 *
 * @author ANTONIO SANZ PANS
 * TEMA 11
 */
public class Player {

    private String name;
    private int power;
    private int multiclick;
    private int cooldown;
    private boolean autoclick;
    private int score;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.power = 0;
        this.multiclick = 0;
        this.cooldown = 0;
        this.autoclick = false;
        this.score = 0;
    }

    public Player(String name, int power, int multiclick, int cooldown, boolean autoclick, int score) {
        this.name = name;
        this.power = power;
        this.multiclick = multiclick;
        this.cooldown = cooldown;
        this.autoclick = autoclick;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMulticlick() {
        return multiclick;
    }

    public void setMulticlick(int multiclick) {
        this.multiclick = multiclick;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public boolean isAutoclick() {
        return autoclick;
    }

    public void setAutoclick(boolean autoclick) {
        this.autoclick = autoclick;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", power=" + power + ", multiclick=" + multiclick + ", cooldown=" + cooldown + ", autoclick=" + autoclick + ", score=" + score + '}';
    }

}
