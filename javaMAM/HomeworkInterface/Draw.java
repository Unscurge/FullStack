package HomeworkInterface;

public class Draw {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        Circle c = new Circle();
        Square s = new Square();

        r.draw();
        c.draw();
        s.draw();
    }
}

interface Drawable {
    void draw();
}

class rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}

class Circle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }

}

class Square implements Drawable {

    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }

}