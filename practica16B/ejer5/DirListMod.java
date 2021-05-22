import java.io.*;

class DirListMod {
    public static void main(String args[]) {
        String dirname = "ejer1";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Directorio de " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + "\tEs un directorio");
                } else {
                    System.out.println(s[i] + "\tEs un archivo");
                }
            }
        } else {
            System.out.println(dirname + "\tNo es un directorio");
        }
    }
}