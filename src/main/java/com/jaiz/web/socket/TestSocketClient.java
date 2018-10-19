package com.jaiz.web.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestSocketClient {
    public static void main(String[] args) {
        Socket s=null;
        try {
            s=new Socket("localhost",5249);
            System.out.println("连接建立");
            Scanner sc=new Scanner(System.in);
            OutputStream os=s.getOutputStream();
            //new PrintWriter(s.getOutputStream(),true);
            while(sc.hasNext()){
                String next=sc.next();
                System.out.println("输入了"+next);
                if(!"quit".equals(next)){
                    os.write(next.getBytes());
                    os.flush();
                    os.flush();
                    System.out.println("stream写出"+next);
                }else{
                    os.write("quit".getBytes());
                    os.flush();
                    os.flush();
                    break;
                }
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(s!=null){
                try {
                    s.shutdownOutput();
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
