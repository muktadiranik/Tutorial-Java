import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, z = 0;
        System.out.print("a: ");
        a = sc.nextInt();
        try {
            z = 10 / a;
        }catch (Exception exception){
            System.out.println(exception);
        }
        System.out.println(z);
    }
}
