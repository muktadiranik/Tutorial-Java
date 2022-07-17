import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int a = 25;
        int b = 35;
        int c = 20;
        int d = 30;

        int[] array = new int[4];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        System.out.println(array[0]);
        System.out.println(array.length);
        Arrays.sort(array);
        System.out.println(array[0]);

        int[] arr = {25, 35, 20, 30};
        System.out.println(arr[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);

        int[][] arr_2d = {{255, 355}, {250, 350}};
        System.out.println(arr_2d[0][0]);
        System.out.println(arr_2d[0][1]);
        System.out.println(arr_2d[1][0]);
        System.out.println(arr_2d[1][1]);


    }
}
