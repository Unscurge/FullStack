package Homework.Chair;

public class Launch {
    public static void main(String[] args) {
        atri at1 = new atri();
        at1.getbrnd("Nilkamal");
        at1.gettyp("Office");
        at1.getMat("Plastic");
        at1.getCol("Black");

        System.out.println("Brand : " + at1.setbrnd());
        System.out.println("Type : " + at1.settyp());
        System.out.println("Material : " + at1.setMat());
        System.out.println("Colour : " + at1.setCol());
    }
}
