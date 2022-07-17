import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        int i = (int)(Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("x: ");
            x = sc.nextInt();
            if (x == i){
                System.out.format("%d == %d", x, i);
                break;
            }
            else if (x > i){
                System.out.format("%d > %d", x, i);
            }
            else {
                System.out.format("%d < %d", x, i);
            }
            System.out.println();
        }while (x >= 0);
    }
}
