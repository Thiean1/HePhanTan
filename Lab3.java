import java.net.InetAddress;
import java.net.Socket;

public class Lab3{
    public static void main(String[] avgv) throws Exception {
        InetAddress addr = InetAddress.getByName("www.dtu.edu.vn");
        int port = 80;
        Socket socket = new Socket(addr,port);
        
    }
}