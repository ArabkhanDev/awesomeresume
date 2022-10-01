/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import util.FileUtility;
/**
 *
 * @author SMART
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("192.168.0.100", 7896);
        OutputStream outputstream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputstream);
        
        byte[] bytes = "test".getBytes();
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
    }
}
