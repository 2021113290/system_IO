package IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Use_fileReader {
    public static void main(String[] args) throws IOException {
        //使用字符流读文件
        Reader reader=new FileReader("./hello.txt");
        while (true){
            int ret=reader.read();
            if (ret==-1){
                break;
            }
            char c=(char) ret;
            System.out.println(c);
        }
        reader.read();
        reader.close();
    }
}
