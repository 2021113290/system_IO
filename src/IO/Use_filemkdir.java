package IO;

import java.io.File;

public class Use_filemkdir {
    public static void main(String[] args) {
        File file=new File("./testDir/a/b");
//        file.mkdir();//创建单层目录
        file.mkdirs();
    }
}
