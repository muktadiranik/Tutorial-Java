public class casting {
    public static void main(String[] args) {
        // implicit casting
        double a = 100.00;
        double b = a + 18;
        System.out.println(b);

        // explicit casting
        int c = 100;
        int d = c + (int)18.0;
        System.out.println(d);

        // constant
        final int E = 5;

        // operators
        double e = a + b;
        System.out.format("double e: %f", e);
        double f = 12 % 10;
        System.out.printf("%f", f);
        System.out.printf("%f", f);

        // unary operators
        System.out.println();
        System.out.println(a);
        a++;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        // Math class
        System.out.println(Math.max(2.22, 4.44));
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 100));

    }
}
