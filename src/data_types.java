import java.util.Locale;

public class data_types {
    public static void main(String[] args) {
        // primitive type
        byte a = 5; // 1 byte
        System.out.println(a);
        short b = 10; // 2 byte
        System.out.println(b);
        int c = 10; // 4 byte
        System.out.println(c);
        long d = 100L; // 8 byte
        System.out.println(d);
        float e = 10.00F; // 4 byte
        System.out.println(e);
        double f = 100.00; // 8 byte
        System.out.println(f);
        char g = 'c'; // 2 byte
        System.out.println(g);
        boolean h = true; // 1 byte
        System.out.println(h);

        // non-primitive type
        String x = "this is a string"; // variable space
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        String y = new String("this is a string using 'new' keyword");
        System.out.println(y);

        String z = x + " and " + y;
        System.out.println(z);

        System.out.println(z.charAt(0));

        System.out.println(z.contains("and"));
        System.out.println(y.compareTo(x));
        System.out.println(x.codePointAt(0));

        String i = z.replace('t', 'T');
        System.out.println(i);

        System.out.println(i.substring(0, 5));

    }
}
