package test.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class DD implements Runnable {

    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(3028);
//创建一个serversocket其端口与发送端的端口是一样的
            Socket s = ss.accept();
//侦听并接受到此套接字的连接，返回一个socket对象
            InputStream is = s.getInputStream();
//获取到输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            byte[] buf = new byte[1024];
//接收收到的数据
            int line = 0;
            while ((line = is.read(buf)) != -1) {
                System.out.println(new String(buf, 0, line));
//将接收到的数据在控制台输出
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
