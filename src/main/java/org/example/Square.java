package org.example;

public class Square implements Graphic{
    private final String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем " + color + " квадрат");
    }
}
