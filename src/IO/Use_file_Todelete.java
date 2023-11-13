package IO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Use_file_Todelete {
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
        scanDir(rootDir,token,result);

        System.out.println("找到了符合条件的文件"+result.size()+"个，分别是：");
        for (File file:result
             ) {
            System.out.println(file.getCanonicalPath()+" 是够要删除该文件？(y/n)");
            String in=scanner.next();
            if (in.toLowerCase().equals("y")){
                file.delete();
            }
        }
    }
    private static void scanDir(File rootDir,String token,List<File> result){
        File[] files=rootDir.listFiles();
        if (files==null||files.length==0){//空目录，递归结束
            return;
        }
        for (File file:files
             ) {
            if (file.isDirectory()){
                scanDir(file,token,result);
            }else {
                if (file.getName().contains(token)){
                    result.add(file.getAbsoluteFile());
                }
            }
        }
    }
}
