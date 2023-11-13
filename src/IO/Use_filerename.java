package IO;

import java.io.File;

public class Use_filerename {
    public static void main(String[] args) {
        File file=new File("a.txt");
        File file1=new File("b.txt");
        file.renameTo(file1);
    }
}
