package StringBuild;

public class Launch {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Chaitanya");
        System.out.println(str);

        // Char at index 0
        System.out.println(str.charAt(0));

        // set chat at index
        str.setCharAt(0, 'P');
        System.out.println(str);

        // inserting elements in string
        str.insert(0, 'S');
        System.out.println(str);

        // deleting from a string
        str.delete(0, 2);// starts from 0th place and ends at n-1th place.
        System.out.println(str);

        // appending in a String
        str.append(" Bankar");
        System.out.println(str);

        // finding length
        System.out.println(str.length());

        // reversing the string
        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);

        str.reverse();
        System.out.println(str);
    }
}
