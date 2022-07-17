import java.util.Scanner;

public class and_or {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        if (a > 0 && a < 10){
            System.out.println("a > 0 && a < 10");
        }
        else {
            System.out.println("a > 0 || a < 10");
        }

        if (a < 0 || a > 10){
            System.out.println("a > 0 || a < 10");
        }
        else {
            System.out.println("a > 0 && a < 10");
        }

    }
}
