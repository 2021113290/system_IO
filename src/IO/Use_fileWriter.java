package IO;

import java.io.*;

public class Use_fileWriter {
    public static void main(String[] args) throws IOException {
        Writer outputStream=new FileWriter("./b.txt");
        outputStream.write("hello world");
        outputStream.close();
    }
}
