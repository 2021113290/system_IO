package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Use_fileScanner {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new FileInputStream("./b.txt");
        Scanner scanner=new Scanner(inputStream);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        inputStream.close();
    }
}
