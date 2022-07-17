public class switch_condition {
    public static void main(String[] args) {
        int i = 5;
        switch (i % 2){
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println(i);
        }
    }
}
