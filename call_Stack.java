public class call_Stack {
    public static void main(String[] args) {
        System.out.println("Before call");
        first();
        System.out.println("After call");
    }
    static void first(){
        System.out.println("Before first call");
        second();
        System.out.println("After first call");
    }
    static void second(){
        System.out.println("Before second call");
        System.out.println("After second call");
    }

}
