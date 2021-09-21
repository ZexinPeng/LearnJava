package pers.linus.third;

public abstract class JustificationStrategy {
    int width;

    public JustificationStrategy(int width) {
        this.width = width;
    }
    public abstract void justify(String line);
}
