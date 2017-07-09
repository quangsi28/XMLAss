/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Instance;

public class Client {

    private static String HOST = "172.20.10.2";
    private static int PORT = 5000;
    static Socket socket;
    static DataOutputStream out;

    public Client() {

    }

    public void syncAllData() {
        try {
            socket = new Socket(HOST, PORT);
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("syncAllData");
            //Nhan va luu xml
            InputStream in = socket.getInputStream();
            FileOutputStream outFile = new FileOutputStream("server//AllData.xml");
            byte[] buffer = new byte[1024];
            int count;
            while ((count = in.read(buffer)) >= 0) {
                outFile.write(buffer, 0, count);
            }
            outFile.close();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void syncDataLocalToServer() {
        try {
            String fileName = "client\\Data_" + Instance.MaDL + ".xml";
            socket = new Socket(HOST, PORT);
            out = new DataOutputStream(socket.getOutputStream());
            //Gui xml len Server
            out.writeUTF("syncDataLocal");
            File file = new File(fileName);
            if (file.exists()) {
                //Gui xml ve Client
                OutputStream outStream = socket.getOutputStream();
                FileInputStream inSend = new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int count;
                while ((count = inSend.read(buffer)) >= 0) {
                    outStream.write(buffer, 0, count);
                }
                outStream.close();
                inSend.close();

            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    public static void main(String[] args){
//       new Client().syncAllData();
//    }
}
