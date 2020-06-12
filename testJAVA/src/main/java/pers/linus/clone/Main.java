package pers.linus.clone;

public class Main {
    public static void main(String[] args) {
        CloneableClass cc = new CloneableClass(1, "aaa", 123L, new TmpClass(5));
        try {
            CloneableClass ccClone = cc.clone();
            System.out.println(ccClone.a);
            System.out.println(ccClone.b);
            ccClone.tmpClass.a = 123;
            System.out.println(ccClone.tmpClass.a);
            System.out.println(cc.tmpClass.a);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
