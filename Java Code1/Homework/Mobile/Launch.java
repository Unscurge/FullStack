package Homework.Mobile;

public class Launch {
    public static void main(String[] args) {
        specs s1 = new specs();
        s1.getName("Xiomi");
        s1.getCam(48);
        s1.getRam(8);
        s1.getInt(512);

        System.out.println("Name : " + s1.setName());
        System.out.println("Camera : " + s1.setCam() + "MP");
        System.out.println("Ram : " + s1.setRam() + "GB");
        System.out.println("Internal Storage : " + s1.setInt() + "GB");

    }
}
