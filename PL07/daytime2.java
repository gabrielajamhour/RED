import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

public class daytime2 {
    public static void main(String[] args) {

        try {
            DatagramSocket ds = new DatagramSocket(7777);
            
            ds.setSoTimeout(5000);

            while (true) {
                byte[] b = new byte[1000];
                DatagramPacket p = new DatagramPacket(b, 1000);

                ds.receive(p);

                Date now = new Date();
                String now_string = now.toString() + "\r\n";
                
                DatagramPacket dp = new DatagramPacket(

                ds.send(dp);
                System.out.println(now_string);
            }
        } catch (Exception e) {
    }
}