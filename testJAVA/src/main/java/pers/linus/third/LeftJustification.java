package pers.linus.third;

public class LeftJustification extends JustificationStrategy{
    public LeftJustification(int width) {
        super(width);
    }

    @Override
    public void justify(String line) {
        System.out.println(line);
    }
}
