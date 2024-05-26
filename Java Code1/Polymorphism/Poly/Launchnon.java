package Polymorphism.Poly;

public class Launchnon {
    public static void main(String[] args) {
        BMW b = new BMW(); // non polymorphic approach
        b.speed();
        b.engine();
        b.colour();
        b.price();
        audi a = new audi(); // non polymorphic approach
        a.speed();
        a.engine();
        a.colour();
        a.price();
        jeep j = new jeep(); // non polymorphic approach
        j.speed();
        j.engine();
        j.colour();
        j.price();
        mustang m = new mustang(); // non polymorphic approach
        m.speed();
        m.engine();
        m.colour();
        m.price();
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

class BMW {
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

class audi {
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

class jeep {
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

class mustang {
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