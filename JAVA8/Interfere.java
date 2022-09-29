public class Interfere {
    //LAMBDA VERSION
    public static void main(String[] args) {


        Thread th = new Thread(() -> System.out.println("thread using Lambda."));
        th.start();
    }
}
