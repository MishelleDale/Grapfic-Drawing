package org.example;

class Circle implements Graphic {
     private final String color;

     public Circle(String color) {
        this.color = color;
     }

     @Override
     public void draw() {
        System.out.println("Рисуем " + color + " круг");
     }
}
