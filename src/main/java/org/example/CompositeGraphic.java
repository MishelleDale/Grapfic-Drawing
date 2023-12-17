package org.example;
import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{
    private final List<Graphic> graphics = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Рисуем контейнер с фигурами");
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}
