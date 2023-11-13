package IO;

import java.io.File;

public class Use_filedelete {
    public static void main(String[] args) {
        File file=new File("./test.txt");
        file.delete();
    }
}
