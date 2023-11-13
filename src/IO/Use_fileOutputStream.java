package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Use_fileOutputStream {
    public static void main(String[] args) throws IOException {
        //OutputStream写文件的时候，只要打开文件成功，就会把原有的内容清空
        OutputStream outputStream=new FileOutputStream("./hello.txt");
        outputStream.write(97);
        outputStream.write(98);
        outputStream.write(99);
        outputStream.close();
    }



}
