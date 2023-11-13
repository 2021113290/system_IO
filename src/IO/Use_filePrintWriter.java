package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Use_filePrintWriter {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream=new FileOutputStream("./b.txt");
        PrintWriter writer=new PrintWriter(outputStream);
        writer.println();
        writer.printf("a=%d\n",10);
        writer.flush();
        outputStream.close();

    }
}
