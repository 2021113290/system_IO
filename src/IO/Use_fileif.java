package IO;

import java.io.File;
import java.io.IOException;

public class Use_fileif {
    public static void main(String[] args) throws IOException {
        File file=new File("./hello.txt");
        System.out.println(file.exists());//判定文件是否存在1
        System.out.println(file.isDirectory());//判定是否是目录
        System.out.println(file.isFile());//判定是否是文件
        file.createNewFile();
        System.out.println(file.exists());//判定文件是否存在1
        System.out.println(file.isDirectory());//判定是否是目录
        System.out.println(file.isFile());//判定是否是文件
    }
}
