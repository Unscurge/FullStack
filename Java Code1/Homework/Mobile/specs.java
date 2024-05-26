package Homework.Mobile;

public class specs {
    int ram;
    int Internal;
    int cam;
    String name;

    public void getRam(int rm) {
        ram = rm;
    }

    public void getInt(int Intern) {
        Internal = Intern;
    }

    public void getCam(int Cam) {
        cam = Cam;
    }

    public void getName(String nme) {
        name = nme;
    }

    public int setRam() {
        return ram;
    }

    public int setInt() {
        return Internal;
    }

    public int setCam() {
        return cam;
    }

    public String setName() {
        return name;
    }
}
