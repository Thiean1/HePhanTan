import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Lab328 {
    public static void main(String[] avgv) throws Exception {
        int port = 2000;
        ServerSocket svr = new ServerSocket(port);
        // Cho ket noi tu Client
        Socket socket = svr.accept();
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        wr.write("I love you");
        wr.flush();
        System.out.println("Helloo");
    }
}
