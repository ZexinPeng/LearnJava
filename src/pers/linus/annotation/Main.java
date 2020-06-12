package pers.linus.annotation;

/**
 * 注解是通过给字段或者方法加上元数据以便系统对其行为作出反应
 */
public class Main {
    public static void main(String[] args) {
        Class A = Apple.class;
        FruitAnnotationUtil.getFruitInfo(Apple.class);
    }
}
