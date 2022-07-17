import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println("a % 2 == 0");
        }
        else {
            System.out.println("a % 2 != 0");
        }

    }
}
