package org.lukas.javach.item1;

/**
 * Created by Lukas on 29.08.2016.
 *
 * @author Lukas Pecak
 */
class Shapes {
    private Shapes(){}
    static Shape triangle(String color) {
        class Triangle extends AbstractShape {
            private Triangle(String color) {
                super(color, "triangle");
            }
            public String getColor() {
                return color;
            }

            public String getName() {
                return name;
            }
        }
        return new Triangle(color);
    }

    static Shape square(String color) {
        class Square extends AbstractShape {
            private Square(String color) {
                super(color, "square");
            }
            public String getColor() {
                return color;
            }

            public String getName() {
                return name;
            }
        }
        return new Square(color);
    }

    abstract static class AbstractShape implements Shape {
        String color;
        String name;
        private AbstractShape(String color, String name) {
            this.color = color;
            this.name = name;
        }
    }
}
