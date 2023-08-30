import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Lab322 {
    
    public static void main(String[] args) throws Exception {
        int c;
        Socket s = new Socket("internic.com",43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        String str = "asdfgfhadf\n";
        byte buf[] = str.getBytes();
        out.write(buf);
        while ((c= in.read()) != -1) {
            System.out.println((char) c);
        }
        s.close();

        
    }
}
