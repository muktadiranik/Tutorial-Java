public class break_continue {
    public static void main(String[] args) {
        int i = 0;
        for(i = 0; i < 10; i++){
            System.out.print(i);
            System.out.print(" ");
            if (i > 5){
                break;
            }
        }
        System.out.println();
        i = 0;
        while(i < 10){
            i++;
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
