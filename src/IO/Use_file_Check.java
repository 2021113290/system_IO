package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Use_file_Check {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要扫描的根目录：");
        File rootDir=new File(scanner.next());
        if (!rootDir.isDirectory()){
            System.out.println("输入的根目录不存在或不是目录，已退出");
            return;
        }
        System.out.println("请输入要找出的文件名中的字符：");
        String token=scanner.next();
        List<File> result=new ArrayList<>();
        //深度优先遍历所有目录
        scanDirName(rootDir,token,result);

        System.out.println("找到了符合条件的文件"+result.size()+"个，分别是：");
        for (File file:result
        ) {
            System.out.println(file.getCanonicalPath());
    }
    }
    private static void scanDirName(File rootDir,String token,List<File> result){
        File[] files=rootDir.listFiles();
        if (files==null||files.length==0){//空目录，递归结束
            return;
        }
        for (File file:files
        ) {
            if (file.isDirectory()){
                scanDirName(file,token,result);
            }else {
                if (file.getName().contains(token)||isContentContains(file,token)){
                    result.add(file.getAbsoluteFile());
                }
            }
        }
    }
    private static boolean isContentContains(File file,String token){
        StringBuilder sb=new StringBuilder();
        try (InputStream is=new FileInputStream(file)){
            try (Scanner scanner=new Scanner(is,"UTF-8")){
                while (scanner.hasNextLine()){
                    sb.append(scanner.nextLine());
                    sb.append("\r\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.indexOf(token)!=-1;
    }
}
