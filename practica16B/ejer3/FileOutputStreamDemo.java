import java.io.*;

class FileOutputStreamDemo {
    public static void main(String args[]) throws Exception {
        String source = "Ahora es el momento de que los hombres buenos\n" + "vengan a ayuda a su país\n"
                + "y paguen sus impuestos";
        byte buf[] = new byte[source.length()];
        source.getBytes(0, buf.length, buf, 0);
        OutputStream f0 = new FileOutputStream("file.txt");
        for (int i = 0; i < buf.length; i += 2) {
            f0.write(buf[i]);
        }
        f0.close();
        OutputStream f1 = new FileOutputStream("file2.txt");
        f1.write(buf);
        f1.close();
        OutputStream f2 = new FileOutputStream("file3.txt");
        f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        f2.close();
    }
}