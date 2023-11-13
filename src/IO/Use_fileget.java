package IO;

import java.io.File;
import java.io.IOException;

public class Use_fileget {
    public static void main(String[] args) throws IOException {
        File file=new File("./test.txt");
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalPath());
    }
}
