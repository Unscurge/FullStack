package HomeworkInterface;

public class Fly {
    public static void main(String[] args) {

        Spacecarft s = new Spacecarft();
        Airplane a = new Airplane();
        Helicopter h = new Helicopter();

        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
}

class Spacecarft implements flyable {

    @Override
    public void fly_obj() {
        System.out.println("Elon Musk");
    }

}

class Airplane implements flyable {

    @Override
    public void fly_obj() {
        System.out.println("");
    }

}

class Helicopter implements flyable {

    @Override
    public void fly_obj() {
        System.out.println("");
    }

}

interface flyable {
    void fly_obj();
}