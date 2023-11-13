package IO;

import java.io.File;
import java.util.Arrays;

public class Use_filelist {
    public static void main(String[] args) {
        File file=new File("./testDir");
        String[] strings=file.list();
        System.out.println(Arrays.toString(strings));
    }
}
