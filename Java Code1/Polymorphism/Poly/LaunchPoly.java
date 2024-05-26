package Polymorphism.Poly;

public class LaunchPoly {
    public static void main(String[] args) {
        permission p = new permission(); // Polymorphic approach
        BMW b = new BMW();
        audi a = new audi();
        jeep j = new jeep();
        mustang m = new mustang();

        p.permit(b);
        p.permit(a);
        p.permit(j);
        p.permit(m);

    }

}

class car {
    public void colour() {
        System.out.println();
    }

    public void engine() {
        System.out.println();
    }

    public void speed() {
        System.out.println();
    }

    public void price() {
        System.out.println();
    }
}

class BMW extends car {
    public void colour() {
        System.out.println("Blue");
    }

    public void engine() {
        System.out.println("v8");
    }

    public void speed() {
        System.out.println("255kmph");
    }

    public void price() {
        System.out.println("100000$");
    }
}

class audi extends car {
    public void colour() {
        System.out.println("Black");
    }

    public void engine() {
        System.out.println("v12");
    }

    public void speed() {
        System.out.println("185kmph");
    }

    public void price() {
        System.out.println("89000$");
    }

}

class jeep extends car {
    public void colour() {
        System.out.println("Red");
    }

    public void engine() {
        System.out.println("v6");
    }

    public void speed() {
        System.out.println("180kmph");
    }

    public void price() {
        System.out.println("55000$");
    }
}

class mustang extends car {
    public void colour() {
        System.out.println("Yellow");
    }

    public void engine() {
        System.out.println("v12");
    }

    public void speed() {
        System.out.println("200kmph");
    }

    public void price() {
        System.out.println("91000$");
    }
}

class permission {
    public void permit(car c) {
        c.speed();
        c.engine();
        c.colour();
        c.price();
    }
}
