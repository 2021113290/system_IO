package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Use_fileInputStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new FileInputStream("./b.txt");
        while (true){
            int b= inputStream.read();
            if (b==-1){
                break;
            }
            System.out.println(b);
        }
        inputStream.close();
    }
}
