package pers.linus.third;

public class RightJustification extends JustificationStrategy{
    public RightJustification(int width) {
        super(width);
    }

    @Override
    public void justify(String line) {
        String buf = new String();
        int offset = width - line.length();
        for (int i = 0; i < offset; i++)
            buf = buf + " ";
        buf = buf + line;
        System.out.println(buf);
    }
}
