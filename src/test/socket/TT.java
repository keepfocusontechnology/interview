package test.socket;

import java.io.*;
import java.net.Socket;

public class TT implements Runnable{


    @Override
    public void run() {
        try {
            Socket s=  new Socket("172.18.147.47",3028);
//创建一个socket绑定的端口和地址为：3029，本机。
            OutputStream oos = s.getOutputStream();
//获取到输出流
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(oos));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line= null;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.flush();
//将内容写到控制台
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
