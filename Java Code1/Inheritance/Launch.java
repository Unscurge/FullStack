package Inheritance;

public class Launch {
    public static void main(String[] args) {
        manage m = new manage();

        m.setId(101);
        m.setName("Chaitanya");
        m.setSal(10000);
        m.setExp(5);
        m.setXyz("Self Info");

        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getSal());
        System.out.println(m.getExp());
        System.out.println(m.getXyz());
    }

}
