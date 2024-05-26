package StringB.Buffer;

public class launch {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("SEED");
        System.out.println(sb);
        System.out.println(sb.capacity());// default Value in capacity is 16
        System.out.println(sb.append(" Good"));
        System.out.println(sb.length());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.replace(0, 1, "T"));
        // System.out.println(sb.reverse());
        System.out.println(sb.indexOf("T"));
        System.out.println(sb.insert(0, "z"));
    }
}
