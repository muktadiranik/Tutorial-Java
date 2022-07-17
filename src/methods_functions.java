public class methods_functions {
    public static int add(int a, int b){
        return a + b;
    }

    public static void print_java(){
        System.out.println("print_java");
    }
    public static void main(String[] args) {
        int i = 5, j = 10;
        System.out.println(add(i, j));
        for(i = 0; i < 5; i++){
            print_java();
        }
    }
}
