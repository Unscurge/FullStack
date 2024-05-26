package HomeworkInterface;

public class classexer {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(10, 20);
        Circle c = new Circle();
        c.getArea(5, 0);
        Triangle t = new Triangle();
        t.getArea(10, 20);
    }
}

interface Shape {
    void getArea(int a, int b);

}

class Rectangle implements Shape {

    @Override
    public void getArea(int l, int b) {
        int area;
        area = l * b;
        System.out.println(area);
    }

}

class Circle implements Shape {

    @Override
    public void getArea(int r, int b) {
        double area;
        area = 3.14 * r * r;
        System.out.println(area);
    }

}

class Triangle implements Shape {

    @Override
    public void getArea(int a, int b) {
        double area;
        area = 0.5 * a * b;
        System.out.println(area);
    }

}