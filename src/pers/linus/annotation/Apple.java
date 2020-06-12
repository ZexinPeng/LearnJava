package pers.linus.annotation;

public class Apple {
    @Name(value = "Apple")
    private String name;

    @Color(fruitColor = Color.ColorType.RED)
    private String color;

    @FruitProvider(id = 1)
    private System provider;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public System getProvider() {
        return provider;
    }
}
