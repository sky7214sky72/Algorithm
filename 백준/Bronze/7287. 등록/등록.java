import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(23+"\n");
        bw.write("cws070993");
        bw.flush();
        bw.close();
    }
}