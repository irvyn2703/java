import java.io.*;

public class OnlyExt implements FilenameFilter{
    String ext;
    public OnlyExt(String ext){
        this.ext="."+ext;
    }
    public boolean accept (File dir, String name){
        return name.endsWith(ext);
    }
}

class DirListOnly {
    public static void main(String args[]) {
        String dirname = "ejer1/";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("java");

        String s[] = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}