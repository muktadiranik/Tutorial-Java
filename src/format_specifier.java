public class format_specifier {
    public static void main(String[] args) {
        int i = 5;
        char c = 'a';
        double d = 0.25;
        short s = 105;
        float f = 0.50f;
        boolean b = true;
        System.out.format("%d %c %f %d %f %b", i, c, d, s, f, b);
        System.out.println();
        System.out.format("%d %c %.2f %d %.2f %b", i, c, d, s, f, b);
    }
}
