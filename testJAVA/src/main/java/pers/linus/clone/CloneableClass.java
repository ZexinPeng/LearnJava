package pers.linus.clone;

public class CloneableClass implements Cloneable{
    public int a;
    public String b;
    public long c;
    public TmpClass tmpClass;

    public CloneableClass(int a, String b, long c, TmpClass tmpClass) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.tmpClass = tmpClass;
    }

    public CloneableClass clone() throws CloneNotSupportedException {
        CloneableClass cc = (CloneableClass) super.clone();
        cc.tmpClass = new TmpClass(cc.tmpClass.a);
        return cc;
    }

}
