package IO;

import java.io.*;
import java.util.Scanner;

public class Use_fileCopy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要复制的文件（绝对路径/相对路径）：");
        File srcFile=new File(scanner.next());
        if (!srcFile.exists()){
            System.out.println("文件不存在！");
            return;
        }
        if (!srcFile.isFile()){
            System.out.println("输入的文件有误！");
            return;
        }
        System.out.println("请输入要复制到的文件（绝对路径/相对路径）：");
        File destFile=new File(scanner.next());
        if (destFile.exists()){
            if (destFile.isDirectory()){
                System.out.println("请具体到要复制的文件！");
            }
            if (destFile.isFile()){
                System.out.println("已找到，是否进行复制？(y/n)");
                if (!scanner.next().toLowerCase().equals("y")){
                    System.out.println("已停止复制");
                    return;
                }
            }
        }
        try(InputStream inputStream=new FileInputStream(srcFile);
            OutputStream outputStream=new FileOutputStream(destFile)
        ) {
            while (true){
                int ret=inputStream.read();
                if (ret==-1){
                    break;
                }
                outputStream.write(ret);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
