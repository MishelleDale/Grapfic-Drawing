package org.example;

public class Main {
    public static void main(String[] args) {
        // Создание листов
        Circle redCircle = new Circle("красный");
        Circle greenCircle = new Circle("зеленый");
        Square blueSquare = new Square("синий");

        // Создание контейнера
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(redCircle);
        compositeGraphic.add(greenCircle);

        CompositeGraphic anotherComposite = new CompositeGraphic();
        anotherComposite.add(blueSquare);
        anotherComposite.add(compositeGraphic);

        // Печать листов
        System.out.println("Рисуем независимые фигуры:");
        redCircle.draw();
        greenCircle.draw();
        blueSquare.draw();

        // Печать контеинеров
        System.out.println("\nРисуем контейнер:");
        compositeGraphic.draw();

        System.out.println("\nРисуем еще один контейнер:");
        anotherComposite.draw();
    }
}
