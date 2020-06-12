package pers.linus.annotation;

import java.lang.reflect.Field;

public class FruitAnnotationUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = "水果名称";
        String strFruitColor = "水果颜色";
        String strFruitProvider = "水果供应商信息";

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Name.class)) {
                Name name = field.getAnnotation(Name.class);
                strFruitName = strFruitName + name.value();
                System.out.println(strFruitName);
            }
            else if (field.isAnnotationPresent(Color.class)) {
                Color color = field.getAnnotation(Color.class);
                strFruitColor = strFruitColor + color.fruitColor().toString();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider= field.getAnnotation(FruitProvider.class);
                strFruitProvider = strFruitProvider + " 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvider);
                }
        }
    }
}
