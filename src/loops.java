public class loops {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        int i = 0;
        do {
            System.out.print(i);
            System.out.print(" ");
            i++;
        }while(i < 10);
        System.out.println();

        i = 0;
        while (i < 10){
            System.out.print(i);
            System.out.print(" ");
            i++;
        }
    }
}
