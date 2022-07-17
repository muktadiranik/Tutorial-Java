import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.print("float b: ");
        float b = sc.nextFloat();
        System.out.format("float b: %f", b);

        System.out.print("char c: ");
        char c = sc.next().charAt(0);
        System.out.println(c);
    }
}
