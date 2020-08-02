package test.socket;

public class TestSocket {

    public static void main(String[] args) {
        new Thread(new DD()).start();
//先开启接收端的线程
        new Thread(new TT()).start();
    }
}
